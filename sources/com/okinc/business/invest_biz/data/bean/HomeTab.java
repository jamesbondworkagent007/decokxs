package com.okinc.business.invest_biz.data.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class HomeTab {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String iconDark;
    public final String iconLight;
    public final String tabAlias;
    public final int tabId;
    public final String tabName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HomeTab() {
        this(0, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HomeTab copy$default(HomeTab homeTab, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = homeTab.tabId;
        }
        if ((i2 & 2) != 0) {
            str = homeTab.tabName;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = homeTab.tabAlias;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = homeTab.iconDark;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = homeTab.iconLight;
        }
        return homeTab.OLrzqt(i, str5, str6, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.tabId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeTab OLrzqt(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new HomeTab(i, str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.tabName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeTab)) {
            return false;
        }
        HomeTab homeTab = (HomeTab) obj;
        return this.tabId == homeTab.tabId && Intrinsics.EZpvd((Object) this.tabName, (Object) homeTab.tabName) && Intrinsics.EZpvd((Object) this.tabAlias, (Object) homeTab.tabAlias) && Intrinsics.EZpvd((Object) this.iconDark, (Object) homeTab.iconDark) && Intrinsics.EZpvd((Object) this.iconLight, (Object) homeTab.iconLight);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Integer.hashCode(this.tabId) * 31) + this.tabName.hashCode()) * 31) + this.tabAlias.hashCode()) * 31) + this.iconDark.hashCode()) * 31) + this.iconLight.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HomeTab(tabId=" + this.tabId + ", tabName=" + this.tabName + ", tabAlias=" + this.tabAlias + ", iconDark=" + this.iconDark + ", iconLight=" + this.iconLight + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.HomeTab.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HomeTab> serializer() {
            return HomeTab$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HomeTab(int i, int i2, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        this.tabId = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.tabName = "";
        } else {
            this.tabName = str;
        }
        if ((i & 4) == 0) {
            this.tabAlias = "";
        } else {
            this.tabAlias = str2;
        }
        if ((i & 8) == 0) {
            this.iconDark = "";
        } else {
            this.iconDark = str3;
        }
        if ((i & 16) == 0) {
            this.iconLight = "";
        } else {
            this.iconLight = str4;
        }
    }

    public static final /* synthetic */ void EZpvd(HomeTab homeTab, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || homeTab.tabId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, homeTab.tabId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) homeTab.tabName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, homeTab.tabName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) homeTab.tabAlias, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, homeTab.tabAlias);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) homeTab.iconDark, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, homeTab.iconDark);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) homeTab.iconLight, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, homeTab.iconLight);
    }

    public HomeTab(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.tabId = i;
        this.tabName = str;
        this.tabAlias = str2;
        this.iconDark = str3;
        this.iconLight = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (""))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:383) call: com.okinc.business.invest_biz.data.bean.HomeTab.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HomeTab(int i, String str, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) == 0 ? str4 : "");
    }
}
