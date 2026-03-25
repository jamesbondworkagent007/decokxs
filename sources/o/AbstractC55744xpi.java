package o;

import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xpi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55744xpi extends AbstractC55755xpt<TickersData> {
    public final java.lang.String AYXKKw;
    public boolean AhwBna;
    public java.util.ArrayList<java.lang.String> djBIcL;
    public java.lang.String gEmmrt;
    public java.lang.String isConnected;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC55755xpt
    public java.lang.String AEQbTJ() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC55755xpt
    public java.lang.String EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r4v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.lang.String, boolean, java.util.ArrayList<java.lang.String>):void (m)] (LINE:11) call: o.xpi.<init>(java.lang.String, java.lang.String, boolean, java.util.ArrayList):void type: THIS */
    public /* synthetic */ AbstractC55744xpi(java.lang.String str, java.lang.String str2, boolean z, java.util.ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : arrayList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC55744xpi(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, java.util.ArrayList<java.lang.String> arrayList) {
        super(null, null, str, null, str2, arrayList, 11, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.gEmmrt = str;
        this.AYXKKw = str2;
        this.AhwBna = z;
        this.djBIcL = arrayList;
        this.valueOf = "cup_ticker_listener";
        this.isConnected = "cup_ticker_listener-" + copydefault();
    }

    private final java.lang.String copydefault() {
        java.util.ArrayList<java.lang.String> arrayList;
        java.lang.String strJoinToString$default;
        if (this.gEmmrt.length() > 0) {
            return this.gEmmrt;
        }
        java.util.ArrayList<java.lang.String> arrayList2 = this.djBIcL;
        return (arrayList2 == null || !(arrayList2.isEmpty() ^ true) || (arrayList = this.djBIcL) == null || (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, null, 63, null)) == null) ? "" : strJoinToString$default;
    }
}
