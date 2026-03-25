package com.okinc.core.ok_app.api.event;

import android.os.Bundle;
import com.okinc.rxutils.RxBus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class LiteTabEvent implements RxBus.Application {
    public static final int $stable = 8;
    private Bundle bundle;
    private String mainTab;
    private String subTab;
    private String thirdTab;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LiteTabEvent copy$default(LiteTabEvent liteTabEvent, String str, String str2, String str3, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = liteTabEvent.mainTab;
        }
        if ((i & 2) != 0) {
            str2 = liteTabEvent.subTab;
        }
        if ((i & 4) != 0) {
            str3 = liteTabEvent.thirdTab;
        }
        if ((i & 8) != 0) {
            bundle = liteTabEvent.bundle;
        }
        return liteTabEvent.copy(str, str2, str3, bundle);
    }

    @Override // com.okinc.rxutils.RxBus.Application
    public boolean check(String str) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.mainTab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.subTab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.thirdTab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Bundle component4() {
        return this.bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiteTabEvent copy(@NotNull String str, @NotNull String str2, String str3, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new LiteTabEvent(str, str2, str3, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiteTabEvent)) {
            return false;
        }
        LiteTabEvent liteTabEvent = (LiteTabEvent) obj;
        return Intrinsics.EZpvd((Object) this.mainTab, (Object) liteTabEvent.mainTab) && Intrinsics.EZpvd((Object) this.subTab, (Object) liteTabEvent.subTab) && Intrinsics.EZpvd((Object) this.thirdTab, (Object) liteTabEvent.thirdTab) && Intrinsics.EZpvd(this.bundle, liteTabEvent.bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Bundle getBundle() {
        return this.bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMainTab() {
        return this.mainTab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubTab() {
        return this.subTab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getThirdTab() {
        return this.thirdTab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.mainTab.hashCode();
        int iHashCode2 = this.subTab.hashCode();
        String str = this.thirdTab;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        Bundle bundle = this.bundle;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bundle != null ? bundle.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBundle(Bundle bundle) {
        this.bundle = bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMainTab(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mainTab = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubTab(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.subTab = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setThirdTab(String str) {
        this.thirdTab = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LiteTabEvent(mainTab=" + this.mainTab + ", subTab=" + this.subTab + ", thirdTab=" + this.thirdTab + ", bundle=" + this.bundle + ")";
    }

    public LiteTabEvent(@NotNull String str, @NotNull String str2, String str3, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.mainTab = str;
        this.subTab = str2;
        this.thirdTab = str3;
        this.bundle = bundle;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:android.os.Bundle:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null android.os.Bundle) : (r5v0 android.os.Bundle))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, android.os.Bundle):void (m)] (LINE:15) call: com.okinc.core.ok_app.api.event.LiteTabEvent.<init>(java.lang.String, java.lang.String, java.lang.String, android.os.Bundle):void type: THIS */
    public /* synthetic */ LiteTabEvent(String str, String str2, String str3, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bundle);
    }
}
