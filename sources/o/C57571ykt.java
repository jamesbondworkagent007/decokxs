package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.websocket.bean.OKWSConnDataParseResult;
import com.okinc.websocket.bean.OKWSEvent;
import com.okinc.websocket.connection.OKWsDoh;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ykt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57571ykt extends C57527ykB {
    public long KWHzl;
    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C57527ykB, o.InterfaceC57564ykm
    public void AEQbTJ(OKIncomingData oKIncomingData, @NotNull java.util.Map<java.lang.String, ? extends AbstractC57561ykj> map) {
        Intrinsics.checkNotNullParameter(map, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C57527ykB, o.InterfaceC57564ykm
    public long KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C57527ykB, o.InterfaceC57564ykm
    public AbstractC57561ykj KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> valueOf() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r2v0 java.util.Map))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
  (r4v0 com.okinc.websocket.connection.OKWsDoh)
 A[MD:(java.lang.String, java.util.Map<java.lang.String, java.lang.String>, boolean, com.okinc.websocket.connection.OKWsDoh):void (m)] (LINE:16) call: o.ykt.<init>(java.lang.String, java.util.Map, boolean, com.okinc.websocket.connection.OKWsDoh):void type: THIS */
    public /* synthetic */ C57571ykt(java.lang.String str, java.util.Map map, boolean z, OKWsDoh oKWsDoh, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : map, (i & 4) != 0 ? true : z, oKWsDoh);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57571ykt(@NotNull java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, boolean z, @NotNull OKWsDoh oKWsDoh) {
        super(str, false, null, null, z, oKWsDoh);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(oKWsDoh, "");
        this.OLrzqt = map;
        this.KWHzl = super.KWHzl();
    }

    @Override // o.C57527ykB, o.InterfaceC57564ykm
    public OKWSConnDataParseResult copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        OKWSConnDataParseResult oKWSConnDataParseResult = new OKWSConnDataParseResult();
        oKWSConnDataParseResult.setEvent(OKWSEvent.DATA);
        oKWSConnDataParseResult.setIncomingData(new OKIncomingData(null, ""));
        OKIncomingData incomingData = oKWSConnDataParseResult.getIncomingData();
        Intrinsics.copydefault(incomingData);
        incomingData.setOriginMsg(str);
        return oKWSConnDataParseResult;
    }
}
