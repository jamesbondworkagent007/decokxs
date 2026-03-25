package com.okinc.core.ok_app.api.event;

import android.os.Bundle;
import com.okinc.rxutils.RxBus;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class LiteEarnTabEvent implements RxBus.Application {
    public static final int $stable = 8;
    private Bundle bundle;
    private String currencyId;
    private String defaultTab;
    private String source;

    @Override // com.okinc.rxutils.RxBus.Application
    public boolean check(String str) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Bundle getBundle() {
        return this.bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefaultTab() {
        return this.defaultTab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBundle(Bundle bundle) {
        this.bundle = bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(String str) {
        this.currencyId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefaultTab(String str) {
        this.defaultTab = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSource(String str) {
        this.source = str;
    }

    public LiteEarnTabEvent(String str, String str2, String str3, Bundle bundle) {
        this.source = str;
        this.defaultTab = str2;
        this.currencyId = str3;
        this.bundle = bundle;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (wrap:android.os.Bundle:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null android.os.Bundle) : (r4v0 android.os.Bundle))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, android.os.Bundle):void (m)] (LINE:13) call: com.okinc.core.ok_app.api.event.LiteEarnTabEvent.<init>(java.lang.String, java.lang.String, java.lang.String, android.os.Bundle):void type: THIS */
    public /* synthetic */ LiteEarnTabEvent(String str, String str2, String str3, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : bundle);
    }
}
