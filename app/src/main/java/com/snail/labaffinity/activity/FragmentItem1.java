package com.snail.labaffinity.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.snail.labaffinity.R;
import com.snail.labaffinity.service.Constant;

/**
 * Created by netease on 16-7-25.
 */
public class FragmentItem1 extends Fragment {

    private WebView webView;
    private View rootView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        if (rootView == null) {
            rootView = inflater.inflate(R.layout.item_webview, container, false);
            webView = (WebView) rootView.findViewById(R.id.webview);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient());
            webView.setWebChromeClient(new WebChromeClient());
            webView.loadUrl(Constant.URL);
        } else {
            ViewGroup v = ((ViewGroup) (rootView.getParent()));
            if (v != null) {
                v.removeView(rootView);
            }
        }
        return rootView;
    }

}
