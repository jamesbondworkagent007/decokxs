package com.okinc.business.defi.wallet.tee.activate.model;

import com.okinc.business.defi.biz.net.bean.TeeMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC12782ctV;
import o.InterfaceC17789fSi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class ViewDataReady {
    public static final int $stable = 8;
    private final String formatterTotalFiat;
    private final boolean needToBackup;
    private final TeeMetadata teeMetaData;
    private final AbstractC12782ctV wallet;
    private final InterfaceC17789fSi waringInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ViewDataReady copy$default(ViewDataReady viewDataReady, InterfaceC17789fSi interfaceC17789fSi, boolean z, AbstractC12782ctV abstractC12782ctV, String str, TeeMetadata teeMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC17789fSi = viewDataReady.waringInfo;
        }
        if ((i & 2) != 0) {
            z = viewDataReady.needToBackup;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            abstractC12782ctV = viewDataReady.wallet;
        }
        AbstractC12782ctV abstractC12782ctV2 = abstractC12782ctV;
        if ((i & 8) != 0) {
            str = viewDataReady.formatterTotalFiat;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            teeMetadata = viewDataReady.teeMetaData;
        }
        return viewDataReady.copy(interfaceC17789fSi, z2, abstractC12782ctV2, str2, teeMetadata);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC17789fSi component1() {
        return this.waringInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.needToBackup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV component3() {
        return this.wallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.formatterTotalFiat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeMetadata component5() {
        return this.teeMetaData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ViewDataReady copy(InterfaceC17789fSi interfaceC17789fSi, boolean z, @NotNull AbstractC12782ctV abstractC12782ctV, @NotNull String str, @NotNull TeeMetadata teeMetadata) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(teeMetadata, "");
        return new ViewDataReady(interfaceC17789fSi, z, abstractC12782ctV, str, teeMetadata);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewDataReady)) {
            return false;
        }
        ViewDataReady viewDataReady = (ViewDataReady) obj;
        return Intrinsics.EZpvd(this.waringInfo, viewDataReady.waringInfo) && this.needToBackup == viewDataReady.needToBackup && Intrinsics.EZpvd(this.wallet, viewDataReady.wallet) && Intrinsics.EZpvd((Object) this.formatterTotalFiat, (Object) viewDataReady.formatterTotalFiat) && Intrinsics.EZpvd(this.teeMetaData, viewDataReady.teeMetaData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFormatterTotalFiat() {
        return this.formatterTotalFiat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedToBackup() {
        return this.needToBackup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeMetadata getTeeMetaData() {
        return this.teeMetaData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV getWallet() {
        return this.wallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC17789fSi getWaringInfo() {
        return this.waringInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        InterfaceC17789fSi interfaceC17789fSi = this.waringInfo;
        return ((((((((interfaceC17789fSi == null ? 0 : interfaceC17789fSi.hashCode()) * 31) + Boolean.hashCode(this.needToBackup)) * 31) + this.wallet.hashCode()) * 31) + this.formatterTotalFiat.hashCode()) * 31) + this.teeMetaData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ViewDataReady(waringInfo=" + this.waringInfo + ", needToBackup=" + this.needToBackup + ", wallet=" + this.wallet + ", formatterTotalFiat=" + this.formatterTotalFiat + ", teeMetaData=" + this.teeMetaData + ")";
    }

    public ViewDataReady(InterfaceC17789fSi interfaceC17789fSi, boolean z, @NotNull AbstractC12782ctV abstractC12782ctV, @NotNull String str, @NotNull TeeMetadata teeMetadata) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(teeMetadata, "");
        this.waringInfo = interfaceC17789fSi;
        this.needToBackup = z;
        this.wallet = abstractC12782ctV;
        this.formatterTotalFiat = str;
        this.teeMetaData = teeMetadata;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:o.fSi:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.fSi) : (r7v0 o.fSi))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (r9v0 o.ctV)
  (r10v0 java.lang.String)
  (r11v0 com.okinc.business.defi.biz.net.bean.TeeMetadata)
 A[MD:(o.fSi, boolean, o.ctV, java.lang.String, com.okinc.business.defi.biz.net.bean.TeeMetadata):void (m)] (LINE:81) call: com.okinc.business.defi.wallet.tee.activate.model.ViewDataReady.<init>(o.fSi, boolean, o.ctV, java.lang.String, com.okinc.business.defi.biz.net.bean.TeeMetadata):void type: THIS */
    public /* synthetic */ ViewDataReady(InterfaceC17789fSi interfaceC17789fSi, boolean z, AbstractC12782ctV abstractC12782ctV, String str, TeeMetadata teeMetadata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : interfaceC17789fSi, (i & 2) != 0 ? false : z, abstractC12782ctV, str, teeMetadata);
    }
}
