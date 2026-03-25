package o;

import com.okinc.localization.util.format.DisplaySign;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nlq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34937nlq implements InterfaceC49405unt<kotlin.Pair<? extends java.lang.String, ? extends DisplaySign>, java.lang.String> {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    @yCM
    public C34937nlq() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC49405unt
    public /* bridge */ /* synthetic */ java.lang.String AEQbTJ(kotlin.Pair<? extends java.lang.String, ? extends DisplaySign> pair) {
        return AEQbTJ2((kotlin.Pair<java.lang.String, ? extends DisplaySign>) pair);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return InterfaceC49405unt.Activity.KWHzl(this);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.String OLrzqt(@NotNull kotlin.Pair<java.lang.String, ? extends DisplaySign> pair) {
        return (java.lang.String) InterfaceC49405unt.Activity.EZpvd(this, pair);
    }

    /* JADX INFO: renamed from: o.nlq$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nlq.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method */
    public java.lang.String AEQbTJ2(@NotNull kotlin.Pair<java.lang.String, ? extends DisplaySign> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return AEQbTJ(pair.getFirst(), pair.getSecond());
    }

    public final java.lang.String AEQbTJ(java.lang.String str, DisplaySign displaySign) {
        return str.length() == 0 ? "--" : pTB.formatICUPercent$default(pTB.OLrzqt((java.lang.Object) str), null, C38307pTy.Companion.EZpvd(2), displaySign, java.lang.Double.valueOf(100.0d), null, 17, null);
    }
}
