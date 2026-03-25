package com.okinc.business.market.data.model.alert;

import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
public abstract class AlertUiItem implements Parcelable {
    public boolean AuCTel;
    public final String DbNXlk;
    public boolean fJNWhG;
    public final String isConnected;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String), (r3v0 boolean), (r4v0 boolean) A[MD:(java.lang.String, java.lang.String, boolean, boolean):void (m)] call: com.okinc.business.market.data.model.alert.AlertUiItem.<init>(java.lang.String, java.lang.String, boolean, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AlertUiItem(String str, String str2, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AYXKKw() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String KWHzl() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String OLrzqt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fetchVPNInfo() {
        return this.AuCTel;
    }

    public AlertUiItem(String str, String str2, boolean z, boolean z2) {
        this.isConnected = str;
        this.DbNXlk = str2;
        this.fJNWhG = z;
        this.AuCTel = z2;
    }
}
