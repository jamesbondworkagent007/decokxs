package o;

import aws.smithy.kotlin.runtime.time.TimestampFormat;
import com.huawei.hms.framework.common.ContainerUtils;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.CO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class EG implements EB {
    public final java.lang.String EZpvd;
    public final EI OLrzqt;
    public final C5101Et copydefault;

    @Override // o.EB
    public void AEQbTJ() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(short s) {
        this.OLrzqt.AEQbTJ(s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(double d) {
        this.OLrzqt.OLrzqt(d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull java.math.BigInteger bigInteger) {
        Intrinsics.checkNotNullParameter(bigInteger, "");
        this.OLrzqt.AEQbTJ(bigInteger);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5099Er
    public void EZpvd(@NotNull InterfaceC5103Ev interfaceC5103Ev) {
        Intrinsics.checkNotNullParameter(interfaceC5103Ev, "");
        this.OLrzqt.EZpvd(interfaceC5103Ev);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(boolean z) {
        this.OLrzqt.AEQbTJ(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5099Er
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.KWHzl(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull C5173Hn c5173Hn, @NotNull TimestampFormat timestampFormat) {
        Intrinsics.checkNotNullParameter(c5173Hn, "");
        Intrinsics.checkNotNullParameter(timestampFormat, "");
        this.OLrzqt.OLrzqt(c5173Hn, timestampFormat);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(byte b) {
        this.OLrzqt.copydefault(b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(int i) {
        this.OLrzqt.OLrzqt(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(char c) {
        this.OLrzqt.copydefault(c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(float f) {
        this.OLrzqt.copydefault(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(long j) {
        this.OLrzqt.OLrzqt(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        this.OLrzqt.OLrzqt(bigDecimal);
    }

    public EG(@NotNull EI ei, @NotNull C5101Et c5101Et, @NotNull java.lang.String str) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(ei, "");
        Intrinsics.checkNotNullParameter(c5101Et, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = ei;
        this.copydefault = c5101Et;
        this.EZpvd = str;
        java.util.Set<InterfaceC5096Eo> setAEQbTJ = c5101Et.AEQbTJ();
        java.util.ArrayList<EN> arrayList = new java.util.ArrayList();
        for (InterfaceC5096Eo interfaceC5096Eo : setAEQbTJ) {
            EN en = interfaceC5096Eo instanceof EN ? (EN) interfaceC5096Eo : null;
            if (en != null) {
                arrayList.add(en);
            }
        }
        for (final EN en2 : arrayList) {
            KWHzl(EE.AEQbTJ(en2), new Function0<Unit>() { // from class: aws.smithy.kotlin.runtime.serde.formurl.FormUrlStructSerializer$2$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.KWHzl(en2.EZpvd());
                }
            });
        }
    }

    private final CQ KWHzl() {
        return this.OLrzqt.OLrzqt();
    }

    public final void KWHzl(C5101Et c5101Et, Function0<Unit> function0) throws java.io.IOException {
        if (KWHzl().AhwBna() > 0) {
            CO.Application.writeUtf8$default(KWHzl(), ContainerUtils.FIELD_DELIMITER, 0, 0, 6, null);
        }
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) this.EZpvd)) {
            CO.Application.writeUtf8$default(KWHzl(), this.EZpvd, 0, 0, 6, null);
        }
        CO.Application.writeUtf8$default(KWHzl(), EE.OLrzqt(c5101Et), 0, 0, 6, null);
        CO.Application.writeUtf8$default(KWHzl(), ContainerUtils.KEY_VALUE_DELIMITER, 0, 0, 6, null);
        function0.invoke();
    }

    @Override // o.EB
    public void OLrzqt(@NotNull C5101Et c5101Et, final boolean z) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        KWHzl(c5101Et, new Function0<Unit>() { // from class: aws.smithy.kotlin.runtime.serde.formurl.FormUrlStructSerializer$field$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.EZpvd(z);
            }
        });
    }

    @Override // o.EB
    public void OLrzqt(@NotNull C5101Et c5101Et, final int i) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        KWHzl(c5101Et, new Function0<Unit>() { // from class: aws.smithy.kotlin.runtime.serde.formurl.FormUrlStructSerializer$field$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.OLrzqt(i);
            }
        });
    }

    @Override // o.EB
    public void EZpvd(@NotNull C5101Et c5101Et, final long j) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        KWHzl(c5101Et, new Function0<Unit>() { // from class: aws.smithy.kotlin.runtime.serde.formurl.FormUrlStructSerializer$field$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.copydefault(j);
            }
        });
    }

    @Override // o.EB
    public void copydefault(@NotNull C5101Et c5101Et, final float f) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        KWHzl(c5101Et, new Function0<Unit>() { // from class: aws.smithy.kotlin.runtime.serde.formurl.FormUrlStructSerializer$field$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.copydefault(f);
            }
        });
    }

    @Override // o.EB
    public void AEQbTJ(@NotNull C5101Et c5101Et, @NotNull final java.lang.String str) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl(c5101Et, new Function0<Unit>() { // from class: aws.smithy.kotlin.runtime.serde.formurl.FormUrlStructSerializer$field$11
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.KWHzl(str);
            }
        });
    }

    @Override // o.EB
    public void KWHzl(@NotNull C5101Et c5101Et, @NotNull final C5173Hn c5173Hn, @NotNull final TimestampFormat timestampFormat) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        Intrinsics.checkNotNullParameter(c5173Hn, "");
        Intrinsics.checkNotNullParameter(timestampFormat, "");
        KWHzl(c5101Et, new Function0<Unit>() { // from class: aws.smithy.kotlin.runtime.serde.formurl.FormUrlStructSerializer$field$12
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.KWHzl(c5173Hn, timestampFormat);
            }
        });
    }

    @Override // o.EB
    public void EZpvd(@NotNull C5101Et c5101Et, @NotNull InterfaceC5103Ev interfaceC5103Ev) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        Intrinsics.checkNotNullParameter(interfaceC5103Ev, "");
        interfaceC5103Ev.EZpvd(new EI(KWHzl(), this.EZpvd + EE.OLrzqt(c5101Et) + '.'));
    }

    @Override // o.EB
    public void EZpvd(@NotNull C5101Et c5101Et, @NotNull Function1<? super InterfaceC5094Em, Unit> function1) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        Intrinsics.checkNotNullParameter(function1, "");
        EC ec = new EC(this.OLrzqt, EE.copydefault(c5101Et, this.EZpvd + EE.OLrzqt(c5101Et)));
        function1.invoke(ec);
        ec.EZpvd();
    }

    @Override // o.EB
    public void OLrzqt(@NotNull C5101Et c5101Et, @NotNull Function1<? super InterfaceC5097Ep, Unit> function1) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(new EH(this.OLrzqt, EE.copydefault(c5101Et, this.EZpvd + EE.OLrzqt(c5101Et))));
    }
}
