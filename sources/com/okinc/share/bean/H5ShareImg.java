package com.okinc.share.bean;

import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class H5ShareImg {
    public int outputType;
    public String url;
    public List<WaterMark> watermark;
    public int w = 0;
    public int h = 0;

    public static class WaterMark {
        public static final int MARK_TYPE_IMAGE = 1;
        public static final int MARK_TYPE_TEXT = 2;
        public static final int MARK_TYPE_UNKNOWN = 0;
        public static final int POSITION_CENTER = 4;
        public static final int POSITION_EAST = 5;
        public static final int POSITION_NORTH = 1;
        public static final int POSITION_NORTH_EAST = 2;
        public static final int POSITION_NORTH_WEST = 0;
        public static final int POSITION_SOUTH = 7;
        public static final int POSITION_SOUTH_EAST = 8;
        public static final int POSITION_SOUTH_WEST = 6;
        public static final int POSITION_WEST = 3;
        public Font font;
        public String g;
        public int h;
        public int t;
        public String text;
        public String type;
        public String url;
        public int w;
        public int x;
        public int y;

        public int getType() {
            if (TextUtils.equals(this.type, TtmlNode.TAG_IMAGE)) {
                return 1;
            }
            return TextUtils.equals(this.type, "text") ? 2 : 0;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int getPosition() {
            String str = this.g;
            str.hashCode();
            switch (str) {
                case "center":
                    return 4;
                case "ne":
                    return 2;
                case "se":
                    return 8;
                case "sw":
                    return 6;
                case "east":
                    return 5;
                case "west":
                    return 3;
                case "north":
                    return 1;
                case "south":
                    return 7;
                default:
                    return 0;
            }
        }
    }

    public static class Font {
        public static final String MARK_TYPE_ITALIC = "italic";
        public static final String MARK_TYPE_NORMAL = "normal";
        public String color;
        public int size;
        public String style;
        public float weight;

        public String getStyle() {
            if (TextUtils.equals(this.style, "normal") || !TextUtils.equals(this.style, "italic")) {
                return "normal";
            }
            return "italic";
        }
    }
}
