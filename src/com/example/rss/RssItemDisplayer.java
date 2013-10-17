package com.example.rss;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class RssItemDisplayer extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rss_item_displayer);

        RSSItem selectedRssItem = MyActivity.selectedRssItem;
        TextView titleTv = (TextView)findViewById(R.id.titleTextView);
        WebView contentTv = (WebView)findViewById(R.id.contentTextView);

        final TextView date = (TextView) findViewById(R.id.date);
        date.setText((selectedRssItem.getPubDate()));

        final TextView textLink = (TextView) findViewById(R.id.textLink);
        textLink.setText(selectedRssItem.getLink());

        titleTv.setText(selectedRssItem.getTitle());
        contentTv.loadData(selectedRssItem.getDescription(),"text/html; charset=UTF-8",null);

    }
}