package o;

import com.amplitude.android.AutocaptureOption;
import com.amplitude.core.ServerZone;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C5221Jj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Je, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5216Je extends C5244Kg {
    public static final Activity Companion = new Activity(null);
    public yHO<? super C5242Ke, ? super java.lang.Integer, ? super java.lang.String, Unit> AEQbTJ;
    public boolean AYXKKw;
    public int AhwBna;
    public C5246Ki AkhnZx;
    public boolean AuCTel;
    public C5253Kp AuCTelauCTel;
    public java.lang.Long AubY;
    public boolean AwvSrB;
    public boolean AxsJAY;
    public InterfaceC5243Kf DbNXlk;
    public final android.content.Context EZpvd;
    public C5221Jj KWHzl;
    public java.lang.String OLrzqt;
    public java.util.Set<AutocaptureOption> copydefault;
    public int djBIcL;
    public InterfaceC5245Kh ejfBZ;
    public java.lang.Integer fARcdN;
    public java.lang.String fIwbmz;
    public boolean fJNWhG;
    public MM fetchVPNInfo;
    public int gEmmrt;
    public InterfaceC5243Kf gHZMYf;
    public long getFieldNames;
    public java.lang.Boolean getNewProxyInstance;
    public boolean hDKMBd;
    public long isConnected;
    public java.lang.String iwGUEr;
    public C5218Jg sSMYrx;
    public boolean uzCIH;
    public boolean valueOf;
    public InterfaceC5265Lb values;
    public java.lang.String wlaJM;
    public ServerZone zLjUOn;
    public java.io.File zsXlph;
    public boolean zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Set<AutocaptureOption> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5244Kg
    public void AEQbTJ(java.lang.String str) {
        this.wlaJM = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5244Kg
    public int AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5244Kg
    public int AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5244Kg
    public long AkhnZx() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5244Kg
    public InterfaceC5245Kh AuCTel() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5244Kg
    public ServerZone AuCTelauCTel() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5244Kg
    public java.lang.String AubY() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5218Jg AwvSrB() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AxsJAY() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5244Kg
    public InterfaceC5243Kf DbNXlk() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5244Kg
    public void EZpvd(InterfaceC5265Lb interfaceC5265Lb) {
        this.values = interfaceC5265Lb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.yHO<? super o.Ke, ? super java.lang.Integer, ? super java.lang.String, kotlin.Unit>, o.yHO<o.Ke, java.lang.Integer, java.lang.String, kotlin.Unit> */
    @Override // o.C5244Kg
    public yHO<C5242Ke, java.lang.Integer, java.lang.String, Unit> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5244Kg
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fIwbmz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull InterfaceC5245Kh interfaceC5245Kh) {
        Intrinsics.checkNotNullParameter(interfaceC5245Kh, "");
        this.ejfBZ = interfaceC5245Kh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.AuCTel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5244Kg
    public java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5244Kg
    public void OLrzqt(java.lang.Boolean bool) {
        this.getNewProxyInstance = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.Context copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.AxsJAY = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean ejfBZ() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long fARcdN() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5244Kg
    public java.lang.Integer fIwbmz() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fJNWhG() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5244Kg
    public java.lang.String fetchVPNInfo() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5244Kg
    public int gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gHZMYf() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFieldNames() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5244Kg
    public java.lang.String getNewProxyInstance() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5244Kg
    public boolean hDKMBd() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5244Kg
    public MM isConnected() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5244Kg
    public java.lang.Boolean iwGUEr() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5244Kg
    public boolean sSMYrx() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5244Kg
    public C5253Kp uzCIH() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5244Kg
    public InterfaceC5265Lb valueOf() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5244Kg
    public C5246Ki values() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5244Kg
    public InterfaceC5243Kf wlaJM() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5244Kg
    public java.lang.Long zLjUOn() {
        return this.AubY;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0198: CONSTRUCTOR 
  (r36v0 java.lang.String)
  (r37v0 android.content.Context)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r72v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (30 int) : (r38v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r72v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (30000 int) : (r39v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r72v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("$default_instance") : (r40v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r72v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r41v0 boolean))
  (wrap:o.Kf:?: TERNARY null = ((wrap:int:0x0026: ARITH (r72v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002c: INVOKE (wrap:o.JJ:0x002a: SGET  A[WRAPPED] (LINE:24) o.JJ.copydefault o.JJ) VIRTUAL call: o.JJ.EZpvd():o.Kf A[MD:():o.Kf (m), WRAPPED] (LINE:24)) : (r42v0 o.Kf))
  (wrap:o.Kh:?: TERNARY null = ((wrap:int:0x0033: ARITH (r72v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0039: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:25) call: o.JS.<init>():void type: CONSTRUCTOR) : (r43v0 o.Kh))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x003f: ARITH (r72v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r44v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r72v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:o.yHO:?: TERNARY null = ((wrap:int:0x0050: ARITH (r72v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null o.yHO) : (r46v0 o.yHO))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0058: ARITH (r72v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (5 int) : (r47v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0060: ARITH (r72v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r48v0 boolean))
  (wrap:com.amplitude.core.ServerZone:?: TERNARY null = ((wrap:int:0x0068: ARITH (r72v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006c: SGET  A[WRAPPED] (LINE:31) com.amplitude.core.ServerZone.US com.amplitude.core.ServerZone) : (r49v0 com.amplitude.core.ServerZone))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0071: ARITH (r72v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:o.Kp:?: TERNARY null = ((wrap:int:0x007c: ARITH (r72v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null o.Kp) : (r51v0 o.Kp))
  (wrap:o.Ki:?: TERNARY null = ((wrap:int:0x0087: ARITH (r72v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null o.Ki) : (r52v0 o.Ki))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0092: ARITH (r72v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? false : (r53v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x009d: ARITH (r72v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? false : (r54v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00a8: ARITH (r72v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? false : (r55v0 boolean))
  (wrap:o.Jg:?: TERNARY null = ((wrap:int:0x00b3: ARITH (r72v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00b9: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:38) call: o.Jg.<init>():void type: CONSTRUCTOR) : (r56v0 o.Jg))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00c1: ARITH (r72v0 int) & (2097152 int) A[WRAPPED]) == (0 int)) ? (r57v0 boolean) : false)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00ca: ARITH (r72v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? true : (r58v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00d7: ARITH (r72v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? true : (r59v0 boolean))
  (wrap:long:?: TERNARY null = ((wrap:int:0x00e2: ARITH (r72v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (300000 long) : (r60v0 long))
  (wrap:java.util.Set:?: TERNARY null = ((wrap:int:0x00ee: ARITH (r72v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00f4: INVOKE 
  (wrap:com.amplitude.android.AutocaptureOption:0x00f2: SGET  A[WRAPPED] (LINE:43) com.amplitude.android.AutocaptureOption.SESSIONS com.amplitude.android.AutocaptureOption)
 STATIC call: o.yED.AEQbTJ(java.lang.Object):java.util.Set A[MD:<T>:(T):java.util.Set<T> (m), WRAPPED] (LINE:43)) : (r62v0 java.util.Set))
  (wrap:long:?: TERNARY null = ((wrap:int:0x00fd: ARITH (r72v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (30000 long) : (r63v0 long))
  (wrap:o.Kf:?: TERNARY null = ((wrap:int:0x0108: ARITH (r72v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x010e: INVOKE (wrap:o.JJ:0x010c: SGET  A[WRAPPED] (LINE:45) o.JJ.copydefault o.JJ) VIRTUAL call: o.JJ.AEQbTJ():o.Kf A[MD:():o.Kf (m), WRAPPED] (LINE:45)) : (r65v0 o.Kf))
  (wrap:o.MM:?: TERNARY null = ((wrap:int:0x0117: ARITH (r72v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x011d: INVOKE (wrap:o.JJ:0x011b: SGET  A[WRAPPED] (LINE:46) o.JJ.copydefault o.JJ) VIRTUAL call: o.JJ.OLrzqt():o.MM A[MD:():o.MM (m), WRAPPED] (LINE:46)) : (r66v0 o.MM))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0126: ARITH (r72v0 int) & (536870912 int) A[WRAPPED]) == (0 int)) ? (r67v0 boolean) : true)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x012f: ARITH (r72v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0133: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r68v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x013a: ARITH (r72v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r69v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0142: ARITH (r73v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r70v0 java.lang.Long))
  (wrap:o.Lb:?: TERNARY null = ((wrap:int:0x014b: ARITH (r73v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r71v0 o.Lb) : (null o.Lb))
 A[MD:(java.lang.String, android.content.Context, int, int, java.lang.String, boolean, o.Kf, o.Kh, java.lang.Integer, java.lang.String, o.yHO<? super o.Ke, ? super java.lang.Integer, ? super java.lang.String, kotlin.Unit>, int, boolean, com.amplitude.core.ServerZone, java.lang.String, o.Kp, o.Ki, boolean, boolean, boolean, o.Jg, boolean, boolean, boolean, long, java.util.Set<? extends com.amplitude.android.AutocaptureOption>, long, o.Kf, o.MM, boolean, java.lang.Boolean, java.lang.String, java.lang.Long, o.Lb):void (m)] (LINE:17) call: o.Je.<init>(java.lang.String, android.content.Context, int, int, java.lang.String, boolean, o.Kf, o.Kh, java.lang.Integer, java.lang.String, o.yHO, int, boolean, com.amplitude.core.ServerZone, java.lang.String, o.Kp, o.Ki, boolean, boolean, boolean, o.Jg, boolean, boolean, boolean, long, java.util.Set, long, o.Kf, o.MM, boolean, java.lang.Boolean, java.lang.String, java.lang.Long, o.Lb):void type: THIS */
    public /* synthetic */ C5216Je(java.lang.String str, android.content.Context context, int i, int i2, java.lang.String str2, boolean z, InterfaceC5243Kf interfaceC5243Kf, InterfaceC5245Kh interfaceC5245Kh, java.lang.Integer num, java.lang.String str3, yHO yho, int i3, boolean z2, ServerZone serverZone, java.lang.String str4, C5253Kp c5253Kp, C5246Ki c5246Ki, boolean z3, boolean z4, boolean z5, C5218Jg c5218Jg, boolean z6, boolean z7, boolean z8, long j, java.util.Set set, long j2, InterfaceC5243Kf interfaceC5243Kf2, MM mm, boolean z9, java.lang.Boolean bool, java.lang.String str5, java.lang.Long l, InterfaceC5265Lb interfaceC5265Lb, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, context, (i4 & 4) != 0 ? 30 : i, (i4 & 8) != 0 ? 30000 : i2, (i4 & 16) != 0 ? "$default_instance" : str2, (i4 & 32) != 0 ? false : z, (i4 & 64) != 0 ? JJ.copydefault.EZpvd() : interfaceC5243Kf, (i4 & 128) != 0 ? new JS() : interfaceC5245Kh, (i4 & 256) != 0 ? null : num, (i4 & 512) != 0 ? null : str3, (i4 & 1024) != 0 ? null : yho, (i4 & 2048) != 0 ? 5 : i3, (i4 & 4096) != 0 ? false : z2, (i4 & 8192) != 0 ? ServerZone.US : serverZone, (i4 & 16384) != 0 ? null : str4, (i4 & 32768) != 0 ? null : c5253Kp, (i4 & 65536) != 0 ? null : c5246Ki, (i4 & 131072) != 0 ? false : z3, (i4 & 262144) != 0 ? false : z4, (i4 & 524288) != 0 ? false : z5, (i4 & 1048576) != 0 ? new C5218Jg() : c5218Jg, (i4 & 2097152) == 0 ? z6 : false, (i4 & 4194304) != 0 ? true : z7, (i4 & 8388608) != 0 ? true : z8, (i4 & 16777216) != 0 ? 300000L : j, (i4 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? yED.AEQbTJ(AutocaptureOption.SESSIONS) : set, (i4 & 67108864) != 0 ? 30000L : j2, (i4 & 134217728) != 0 ? JJ.copydefault.AEQbTJ() : interfaceC5243Kf2, (i4 & 268435456) != 0 ? JJ.copydefault.OLrzqt() : mm, (i4 & 536870912) == 0 ? z9 : true, (i4 & 1073741824) != 0 ? java.lang.Boolean.FALSE : bool, (i4 & Integer.MIN_VALUE) != 0 ? null : str5, (i5 & 1) != 0 ? null : l, (i5 & 2) == 0 ? interfaceC5265Lb : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5216Je(@NotNull java.lang.String str, @NotNull android.content.Context context, int i, int i2, @NotNull java.lang.String str2, boolean z, @NotNull InterfaceC5243Kf interfaceC5243Kf, @NotNull InterfaceC5245Kh interfaceC5245Kh, java.lang.Integer num, java.lang.String str3, yHO<? super C5242Ke, ? super java.lang.Integer, ? super java.lang.String, Unit> yho, int i3, boolean z2, @NotNull ServerZone serverZone, java.lang.String str4, C5253Kp c5253Kp, C5246Ki c5246Ki, boolean z3, boolean z4, boolean z5, @NotNull C5218Jg c5218Jg, boolean z6, boolean z7, boolean z8, long j, @NotNull java.util.Set<? extends AutocaptureOption> set, long j2, @NotNull InterfaceC5243Kf interfaceC5243Kf2, @NotNull MM mm, boolean z9, java.lang.Boolean bool, java.lang.String str5, java.lang.Long l, InterfaceC5265Lb interfaceC5265Lb) {
        super(str, i, i2, str2, z, interfaceC5243Kf, interfaceC5245Kh, num, str3, yho, i3, z2, serverZone, str4, c5253Kp, c5246Ki, j2, interfaceC5243Kf2, mm, bool, str5, l, null, 4194304, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC5243Kf, "");
        Intrinsics.checkNotNullParameter(interfaceC5245Kh, "");
        Intrinsics.checkNotNullParameter(serverZone, "");
        Intrinsics.checkNotNullParameter(c5218Jg, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(interfaceC5243Kf2, "");
        Intrinsics.checkNotNullParameter(mm, "");
        this.EZpvd = context;
        this.AhwBna = i;
        this.djBIcL = i2;
        this.fIwbmz = str2;
        this.uzCIH = z;
        this.gHZMYf = interfaceC5243Kf;
        this.ejfBZ = interfaceC5245Kh;
        this.fARcdN = num;
        this.iwGUEr = str3;
        this.AEQbTJ = yho;
        this.gEmmrt = i3;
        this.AwvSrB = z2;
        this.zLjUOn = serverZone;
        this.wlaJM = str4;
        this.AuCTelauCTel = c5253Kp;
        this.AkhnZx = c5246Ki;
        this.AxsJAY = z3;
        this.zuBGHE = z4;
        this.hDKMBd = z5;
        this.sSMYrx = c5218Jg;
        this.valueOf = z6;
        this.AuCTel = z7;
        this.AYXKKw = z8;
        this.getFieldNames = j;
        this.isConnected = j2;
        this.DbNXlk = interfaceC5243Kf2;
        this.fetchVPNInfo = mm;
        this.fJNWhG = z9;
        this.getNewProxyInstance = bool;
        this.OLrzqt = str5;
        this.AubY = l;
        this.values = interfaceC5265Lb;
        this.copydefault = CollectionsKt___CollectionsKt.DXXBbs(set);
        this.KWHzl = new C5221Jj(new Function1<C5221Jj, Unit>() { // from class: com.amplitude.android.Configuration$defaultTracking$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C5221Jj c5221Jj) {
                invoke2(c5221Jj);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C5221Jj c5221Jj) {
                Intrinsics.checkNotNullParameter(c5221Jj, "");
                this.this$0.copydefault(c5221Jj);
            }
        });
    }

    /* JADX INFO: renamed from: o.Je$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Je.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void copydefault(C5221Jj c5221Jj) {
        this.copydefault = c5221Jj.AEQbTJ();
    }

    public final java.io.File zsXlph() {
        if (this.zsXlph == null) {
            java.io.File file = new java.io.File(this.EZpvd.getDir("amplitude", 0), this.EZpvd.getPackageName() + JsonPointer.SEPARATOR + fetchVPNInfo() + "/analytics/");
            this.zsXlph = file;
            file.mkdirs();
        }
        java.io.File file2 = this.zsXlph;
        Intrinsics.copydefault(file2);
        return file2;
    }
}
