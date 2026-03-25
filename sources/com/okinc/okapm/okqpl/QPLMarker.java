package com.okinc.okapm.okqpl;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import com.reown.android.pulse.model.EventType;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class QPLMarker {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ QPLMarker[] $VALUES;
    private final String value;
    public static final QPLMarker BEGIN = new QPLMarker("BEGIN", 0, "begin");
    public static final QPLMarker CREATE = new QPLMarker("CREATE", 1, "create");
    public static final QPLMarker START = new QPLMarker("START", 2, TtmlNode.START);
    public static final QPLMarker ERROR = new QPLMarker(EventType.ERROR, 3, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
    public static final QPLMarker RESUME = new QPLMarker("RESUME", 4, "resume");
    public static final QPLMarker DISPLAYED = new QPLMarker("DISPLAYED", 5, "displayed");
    public static final QPLMarker PAUSE = new QPLMarker("PAUSE", 6, "paused");
    public static final QPLMarker DESTROYED = new QPLMarker("DESTROYED", 7, "destroyed");
    public static final QPLMarker PAGE_LOADED = new QPLMarker("PAGE_LOADED", 8, "page_loaded");
    public static final QPLMarker PAGE_NOT_LOADED = new QPLMarker("PAGE_NOT_LOADED", 9, "page_load_failed");
    public static final QPLMarker LOADING_APPEAR = new QPLMarker("LOADING_APPEAR", 10, "loading_appear");
    public static final QPLMarker LOADING_DISAPPEAR = new QPLMarker("LOADING_DISAPPEAR", 11, "loading_disappear");
    public static final QPLMarker END = new QPLMarker("END", 12, TtmlNode.END);
    public static final QPLMarker NA = new QPLMarker("NA", 13, "NA");
    public static final QPLMarker UNKNOWN = new QPLMarker("UNKNOWN", 14, "unknown");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ QPLMarker[] $values() {
        return new QPLMarker[]{BEGIN, CREATE, START, ERROR, RESUME, DISPLAYED, PAUSE, DESTROYED, PAGE_LOADED, PAGE_NOT_LOADED, LOADING_APPEAR, LOADING_DISAPPEAR, END, NA, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<QPLMarker> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private QPLMarker(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        QPLMarker[] qPLMarkerArr$values = $values();
        $VALUES = qPLMarkerArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(qPLMarkerArr$values);
    }

    public static QPLMarker valueOf(String str) {
        return (QPLMarker) Enum.valueOf(QPLMarker.class, str);
    }

    public static QPLMarker[] values() {
        return (QPLMarker[]) $VALUES.clone();
    }
}
