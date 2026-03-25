package com.okinc.websocket.bean;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class DepthData {
    public static final int $stable = 8;
    private String ts = "";
    private String checksum = "";
    private ArrayList<ComparableArrayList> asks = new ArrayList<>();
    private ArrayList<ComparableArrayList> bids = new ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ComparableArrayList> getAsks() {
        return this.asks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ComparableArrayList> getBids() {
        return this.bids;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChecksum() {
        return this.checksum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAsks(@NotNull ArrayList<ComparableArrayList> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.asks = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBids(@NotNull ArrayList<ComparableArrayList> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.bids = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChecksum(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.checksum = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTs(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ts = str;
    }
}
