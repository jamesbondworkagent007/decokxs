package com.okinc.websocket.bean;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class WSDepthResponse extends WSBaseResponse {
    private String action = "";
    private ArrayList<DepthData> data = new ArrayList<>();
    public static final ActionBar Companion = new ActionBar(null);
    public static final int $stable = 8;
    private static final String ALL_DATA = "snapshot";
    private static final String UPDATE_DATA = "update";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAction() {
        return this.action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<DepthData> getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAction(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.action = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(@NotNull ArrayList<DepthData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.data = arrayList;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.websocket.bean.WSDepthResponse.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final String OLrzqt() {
            return WSDepthResponse.ALL_DATA;
        }

        public final String KWHzl() {
            return WSDepthResponse.UPDATE_DATA;
        }
    }
}
