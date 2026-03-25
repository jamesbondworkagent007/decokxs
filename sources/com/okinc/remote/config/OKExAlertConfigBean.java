package com.okinc.remote.config;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class OKExAlertConfigBean {
    public static final int $stable = 8;
    private String fileID = "";
    private String tVersion = "1";
    private ArrayList<StrategyData> datas = new ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<StrategyData> getDatas() {
        return this.datas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFileID() {
        return this.fileID;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTVersion() {
        return this.tVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDatas(@NotNull ArrayList<StrategyData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.datas = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFileID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fileID = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tVersion = str;
    }
}
