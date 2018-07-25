package com.vito.ad.channels.oneway;

import java.util.ArrayList;
import java.util.List;

public class TrackingEventsURL {
    /**
     * show : 广告开始展示，激励/非激励性广告时必须回传。
     •start : 视频开始播放，激励/非激励性广告时必须回传。
     •firstQuartile : 视频播放四分之一，激励/非激励性广告时必须回传。
     •midpoint : 视频播放一半，激励/非激励性广告时必须回传。
     •thirdQuartile : 视频播放四分之三，激励/非激励性广告时必须回传。
     •end : 视频播放结束，激励性广告时必须回传，非激励性广告有skip事件回传时不应再回传end。
     •skip : 广告跳过，此回传仅在非激励性广告时适用。
     •close : 广告关闭，激励/非激励性广告时必须回传。
     •click : 点击广告按钮,激励/非激励性广告时必须回传。

     */
    private List<String> start;
    private List<String> end;
    private List<String> click;
    private List<String> show ;
    private List<String> skip ;
    private List<String> close ;
    private List<String> midpoint ;
    private List<String> firstQuartile ;
    private List<String> thirdQuartile ;

    public List<String> getStart() {
        if (start==null)
            start = new ArrayList<>();
        return start;
    }

    public void setStart(List<String> start) {
        this.start = start;
    }

    public List<String> getEnd() {
        if (end==null)
            end = new ArrayList<>();
        return end;
    }

    public void setEnd(List<String> end) {
        this.end = end;
    }

    public List<String> getClick() {
        if (click==null)
            click = new ArrayList<>();
        return click;
    }

    public void setClick(List<String> click) {
        this.click = click;
    }

    public List<String> getShow() {
        if (show==null)
            show = new ArrayList<>();
        return show;
    }

    public void setShow(List<String> show) {
        this.show = show;
    }

    public List<String> getSkip() {
        if (skip==null)
            skip = new ArrayList<>();
        return skip;
    }

    public void setSkip(List<String> skip) {
        this.skip = skip;
    }

    public List<String> getClose() {
        if (close==null)
            close = new ArrayList<>();
        return close;
    }

    public void setClose(List<String> close) {
        this.close = close;
    }

    public List<String> getMidpoint() {
        if (midpoint==null)
            midpoint = new ArrayList<>();
        return midpoint;
    }

    public void setMidpoint(List<String> midpoint) {
        this.midpoint = midpoint;
    }

    public List<String> getFirstQuartile() {
        if (firstQuartile==null)
            firstQuartile = new ArrayList<>();
        return firstQuartile;
    }

    public void setFirstQuartile(List<String> firstQuartile) {
        this.firstQuartile = firstQuartile;
    }

    public List<String> getThirdQuartile() {
        if (thirdQuartile==null)
            thirdQuartile = new ArrayList<>();
        return thirdQuartile;
    }

    public void setThirdQuartile(List<String> thirdQuartile) {
        this.thirdQuartile = thirdQuartile;
    }
}
