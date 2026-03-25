package o;

import aws.smithy.kotlin.runtime.time.TimestampFormat;
import java.io.IOException;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CO;
import o.CQ;
import o.EE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class EI implements InterfaceC5106Ey {
    public final CQ AEQbTJ;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CQ OLrzqt() {
        return this.AEQbTJ;
    }

    public EI(@NotNull CQ cq, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(cq, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = cq;
        this.copydefault = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 o.CQ)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
 A[MD:(o.CQ, java.lang.String):void (m)] (LINE:23) call: o.EI.<init>(o.CQ, java.lang.String):void type: THIS */
    public /* synthetic */ EI(CQ cq, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cq, (i & 2) != 0 ? "" : str);
    }

    @Override // o.InterfaceC5106Ey
    public EB EZpvd(@NotNull C5101Et c5101Et) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        return new EG(this, c5101Et, this.copydefault);
    }

    @Override // o.InterfaceC5106Ey
    public InterfaceC5094Em AEQbTJ(@NotNull C5101Et c5101Et) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        return new EC(this, c5101Et);
    }

    @Override // o.InterfaceC5106Ey
    public InterfaceC5097Ep KWHzl(@NotNull C5101Et c5101Et) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        return new EH(this, c5101Et);
    }

    @Override // o.InterfaceC5106Ey
    public byte[] copydefault() {
        return this.AEQbTJ.KWHzl();
    }

    public final void KWHzl(Function1<? super CQ, Unit> function1) {
        function1.invoke(this.AEQbTJ);
    }

    public final void AEQbTJ(final java.lang.String str) {
        KWHzl(new Function1<CQ, Unit>() { // from class: aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerializer$write$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CQ cq) throws IOException {
                invoke2(cq);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull CQ cq) throws IOException {
                Intrinsics.checkNotNullParameter(cq, "");
                CO.Application.writeUtf8$default(cq, EE.AEQbTJ(str), 0, 0, 6, null);
            }
        });
    }

    public void AEQbTJ(boolean z) {
        AEQbTJ(java.lang.String.valueOf(z));
    }

    public void copydefault(final byte b) {
        KWHzl(new Function1<CQ, Unit>() { // from class: aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerializer$serializeByte$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CQ cq) throws IOException {
                invoke2(cq);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull CQ cq) throws IOException {
                Intrinsics.checkNotNullParameter(cq, "");
                EE.EZpvd(cq, Byte.valueOf(b));
            }
        });
    }

    public void copydefault(char c) {
        AEQbTJ(java.lang.String.valueOf(c));
    }

    public void AEQbTJ(final short s) {
        KWHzl(new Function1<CQ, Unit>() { // from class: aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerializer$serializeShort$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CQ cq) throws IOException {
                invoke2(cq);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull CQ cq) throws IOException {
                Intrinsics.checkNotNullParameter(cq, "");
                EE.EZpvd(cq, Short.valueOf(s));
            }
        });
    }

    public void OLrzqt(final int i) {
        KWHzl(new Function1<CQ, Unit>() { // from class: aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerializer$serializeInt$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CQ cq) throws IOException {
                invoke2(cq);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull CQ cq) throws IOException {
                Intrinsics.checkNotNullParameter(cq, "");
                EE.EZpvd(cq, Integer.valueOf(i));
            }
        });
    }

    public void OLrzqt(final long j) {
        KWHzl(new Function1<CQ, Unit>() { // from class: aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerializer$serializeLong$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CQ cq) throws IOException {
                invoke2(cq);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull CQ cq) throws IOException {
                Intrinsics.checkNotNullParameter(cq, "");
                EE.EZpvd(cq, Long.valueOf(j));
            }
        });
    }

    public void copydefault(final float f) {
        KWHzl(new Function1<CQ, Unit>() { // from class: aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerializer$serializeFloat$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CQ cq) throws IOException {
                invoke2(cq);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull CQ cq) throws IOException {
                Intrinsics.checkNotNullParameter(cq, "");
                EE.EZpvd(cq, Float.valueOf(f));
            }
        });
    }

    public void OLrzqt(final double d) {
        KWHzl(new Function1<CQ, Unit>() { // from class: aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerializer$serializeDouble$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CQ cq) throws IOException {
                invoke2(cq);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull CQ cq) throws IOException {
                Intrinsics.checkNotNullParameter(cq, "");
                EE.EZpvd(cq, Double.valueOf(d));
            }
        });
    }

    public void AEQbTJ(@NotNull final java.math.BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        KWHzl(new Function1<CQ, Unit>() { // from class: aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerializer$serializeBigInteger$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CQ cq) throws IOException {
                invoke2(cq);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull CQ cq) throws IOException {
                Intrinsics.checkNotNullParameter(cq, "");
                EE.EZpvd(cq, bigInteger);
            }
        });
    }

    public void OLrzqt(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        java.lang.String plainString = bigDecimal.toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "");
        AEQbTJ(plainString);
    }

    @Override // o.InterfaceC5099Er
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ(str);
    }

    public void OLrzqt(@NotNull C5173Hn c5173Hn, @NotNull TimestampFormat timestampFormat) {
        Intrinsics.checkNotNullParameter(c5173Hn, "");
        Intrinsics.checkNotNullParameter(timestampFormat, "");
        KWHzl(c5173Hn.OLrzqt(timestampFormat));
    }

    @Override // o.InterfaceC5099Er
    public void EZpvd(@NotNull InterfaceC5103Ev interfaceC5103Ev) {
        Intrinsics.checkNotNullParameter(interfaceC5103Ev, "");
        interfaceC5103Ev.EZpvd(this);
    }
}
