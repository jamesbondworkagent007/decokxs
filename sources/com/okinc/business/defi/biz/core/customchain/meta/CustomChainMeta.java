package com.okinc.business.defi.biz.core.customchain.meta;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainMetaEntity;
import com.okinc.business.defi.wallet.bean.CustomNetwork;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C11600cUg;
import o.C33129mqd;
import o.C59454zhO;
import o.C9700baY;
import o.xYW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomChainMeta implements Parcelable {
    public ArrayList<CustomChainCoinMeta> AEQbTJ;
    public String AYXKKw;
    public boolean AhwBna;
    public long AkhnZx;
    public String DbNXlk;
    public long EZpvd;
    public String KWHzl;
    public long OLrzqt;
    public int djBIcL;
    public CustomChainCoinMeta fetchVPNInfo;
    public String gEmmrt;
    public String valueOf;
    public long values;
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public static final Parcelable.Creator<CustomChainMeta> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CustomChainMeta> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomChainMeta createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            long j3 = parcel.readLong();
            long j4 = parcel.readLong();
            CustomChainCoinMeta customChainCoinMetaCreateFromParcel = parcel.readInt() == 0 ? null : CustomChainCoinMeta.CREATOR.createFromParcel(parcel);
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(CustomChainCoinMeta.CREATOR.createFromParcel(parcel));
            }
            return new CustomChainMeta(j, j2, string, string2, z, i, string3, string4, string5, j3, j4, customChainCoinMetaCreateFromParcel, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomChainMeta[] newArray(int i) {
            return new CustomChainMeta[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(CustomChainCoinMeta customChainCoinMeta) {
        this.fetchVPNInfo = customChainCoinMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(long j) {
        this.AkhnZx = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomChainMeta KWHzl(long j, long j2, @NotNull String str, @NotNull String str2, boolean z, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j3, long j4, CustomChainCoinMeta customChainCoinMeta, @NotNull ArrayList<CustomChainCoinMeta> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new CustomChainMeta(j, j2, str, str2, z, i, str3, str4, str5, j3, j4, customChainCoinMeta, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<CustomChainCoinMeta> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(long j) {
        this.EZpvd = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomChainCoinMeta djBIcL() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomChainMeta)) {
            return false;
        }
        CustomChainMeta customChainMeta = (CustomChainMeta) obj;
        return this.OLrzqt == customChainMeta.OLrzqt && this.values == customChainMeta.values && Intrinsics.EZpvd((Object) this.KWHzl, (Object) customChainMeta.KWHzl) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) customChainMeta.AYXKKw) && this.AhwBna == customChainMeta.AhwBna && this.djBIcL == customChainMeta.djBIcL && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) customChainMeta.DbNXlk) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) customChainMeta.gEmmrt) && Intrinsics.EZpvd((Object) this.valueOf, (Object) customChainMeta.valueOf) && this.EZpvd == customChainMeta.EZpvd && this.AkhnZx == customChainMeta.AkhnZx && Intrinsics.EZpvd(this.fetchVPNInfo, customChainMeta.fetchVPNInfo) && Intrinsics.EZpvd(this.AEQbTJ, customChainMeta.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long fetchVPNInfo() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.OLrzqt);
        int iHashCode2 = Long.hashCode(this.values);
        int iHashCode3 = this.KWHzl.hashCode();
        int iHashCode4 = this.AYXKKw.hashCode();
        int iHashCode5 = Boolean.hashCode(this.AhwBna);
        int iHashCode6 = Integer.hashCode(this.djBIcL);
        int iHashCode7 = this.DbNXlk.hashCode();
        int iHashCode8 = this.gEmmrt.hashCode();
        int iHashCode9 = this.valueOf.hashCode();
        int iHashCode10 = Long.hashCode(this.EZpvd);
        int iHashCode11 = Long.hashCode(this.AkhnZx);
        CustomChainCoinMeta customChainCoinMeta = this.fetchVPNInfo;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (customChainCoinMeta == null ? 0 : customChainCoinMeta.hashCode())) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CustomChainMeta(chainId=" + this.OLrzqt + ", realChainId=" + this.values + ", chainName=" + this.KWHzl + ", iconUrl=" + this.AYXKKw + ", fromCustom=" + this.AhwBna + ", forceUpdateType=" + this.djBIcL + ", rpcUrl=" + this.DbNXlk + ", faucetUrl=" + this.gEmmrt + ", explorerUrl=" + this.valueOf + ", createAt=" + this.EZpvd + ", updateAt=" + this.AkhnZx + ", nativeToken=" + this.fetchVPNInfo + ", customTokens=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.OLrzqt);
        parcel.writeLong(this.values);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.AYXKKw);
        parcel.writeInt(this.AhwBna ? 1 : 0);
        parcel.writeInt(this.djBIcL);
        parcel.writeString(this.DbNXlk);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.valueOf);
        parcel.writeLong(this.EZpvd);
        parcel.writeLong(this.AkhnZx);
        CustomChainCoinMeta customChainCoinMeta = this.fetchVPNInfo;
        if (customChainCoinMeta == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            customChainCoinMeta.writeToParcel(parcel, i);
        }
        ArrayList<CustomChainCoinMeta> arrayList = this.AEQbTJ;
        parcel.writeInt(arrayList.size());
        Iterator<CustomChainCoinMeta> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public CustomChainMeta(long j, long j2, @NotNull String str, @NotNull String str2, boolean z, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j3, long j4, CustomChainCoinMeta customChainCoinMeta, @NotNull ArrayList<CustomChainCoinMeta> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.OLrzqt = j;
        this.values = j2;
        this.KWHzl = str;
        this.AYXKKw = str2;
        this.AhwBna = z;
        this.djBIcL = i;
        this.DbNXlk = str3;
        this.gEmmrt = str4;
        this.valueOf = str5;
        this.EZpvd = j3;
        this.AkhnZx = j4;
        this.fetchVPNInfo = customChainCoinMeta;
        this.AEQbTJ = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0042: CONSTRUCTOR 
  (r23v0 long)
  (r25v0 long)
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (r29v0 boolean)
  (r30v0 int)
  (r31v0 java.lang.String)
  (r32v0 java.lang.String)
  (r33v0 java.lang.String)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r40v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r34v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000d: ARITH (r40v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r36v0 long))
  (wrap:com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta:?: TERNARY null = ((wrap:int:0x0016: ARITH (r40v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta) : (r38v0 com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0020: ARITH (r40v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0029: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:55) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r39v0 java.util.ArrayList))
 A[MD:(long, long, java.lang.String, java.lang.String, boolean, int, java.lang.String, java.lang.String, java.lang.String, long, long, com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta, java.util.ArrayList<com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta>):void (m)] (LINE:16) call: com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta.<init>(long, long, java.lang.String, java.lang.String, boolean, int, java.lang.String, java.lang.String, java.lang.String, long, long, com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta, java.util.ArrayList):void type: THIS */
    public /* synthetic */ CustomChainMeta(long j, long j2, String str, String str2, boolean z, int i, String str3, String str4, String str5, long j3, long j4, CustomChainCoinMeta customChainCoinMeta, ArrayList arrayList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, str, str2, z, i, str3, str4, str5, (i2 & 512) != 0 ? 0L : j3, (i2 & 1024) != 0 ? 0L : j4, (i2 & 2048) != 0 ? null : customChainCoinMeta, (i2 & 4096) != 0 ? new ArrayList() : arrayList);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final CustomChainMeta AEQbTJ(@NotNull CustomNetwork customNetwork, long j) {
            Intrinsics.checkNotNullParameter(customNetwork, "");
            long j2 = -Long.parseLong(customNetwork.getChainId());
            long j3 = Long.parseLong(customNetwork.getChainId());
            String name = customNetwork.getName();
            String icon = customNetwork.getIcon();
            Integer forceUpdate = customNetwork.getForceUpdate();
            CustomChainMeta customChainMeta = new CustomChainMeta(j2, j3, name, icon, false, forceUpdate != null ? forceUpdate.intValue() : 0, customNetwork.getRpcUrl(), customNetwork.getFaucetUrl(), customNetwork.getExplorerUrl(), j, 0L, null, null, 7168, null);
            customChainMeta.AEQbTJ(customChainMeta.AEQbTJ(customNetwork.getSymbol(), customNetwork.getName()));
            return customChainMeta;
        }
    }

    public final CustomChainCoinMeta AEQbTJ(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        long j = this.OLrzqt;
        long j2 = this.values;
        return new CustomChainCoinMeta(j, j2, xYW.AEQbTJ.EZpvd(j2, ""), str, str2, this.KWHzl, C9700baY.OLrzqt(C33129mqd.gEmmrt(C59454zhO.wlaJM(str))), "", 0L, 1, 18, System.currentTimeMillis(), null, null, 12288, null);
    }

    public final CustomChainMetaEntity copydefault() {
        long j = this.OLrzqt;
        long j2 = this.values;
        String str = this.KWHzl;
        String strOLrzqt = this.AYXKKw;
        if (strOLrzqt.length() == 0) {
            strOLrzqt = C9700baY.OLrzqt(C33129mqd.gEmmrt(C59454zhO.wlaJM(this.KWHzl)));
        }
        String str2 = strOLrzqt;
        int iOLrzqt = C11600cUg.OLrzqt(this.AhwBna);
        String str3 = this.DbNXlk;
        String str4 = this.gEmmrt;
        String str5 = this.valueOf;
        long j3 = this.EZpvd;
        long j4 = this.AkhnZx;
        CustomChainCoinMeta customChainCoinMeta = this.fetchVPNInfo;
        return new CustomChainMetaEntity(j, j2, str, str2, iOLrzqt, str3, str4, str5, j3, j4, customChainCoinMeta != null ? customChainCoinMeta.KWHzl() : null);
    }
}
