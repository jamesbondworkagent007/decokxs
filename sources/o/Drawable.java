package o;

import aws.sdk.kotlin.runtime.auth.credentials.DefaultChainCredentialsProvider$chain$1;
import aws.sdk.kotlin.runtime.auth.credentials.DefaultChainCredentialsProvider$chain$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Drawable;
import o.InterruptedIOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Drawable implements InterfaceC52778wY {
    public final InterfaceC3972Aw AEQbTJ;
    public final C52751wX AhwBna;
    public final C54914xa EZpvd;
    public final boolean KWHzl;
    public final java.lang.String OLrzqt;
    public final HL copydefault;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Drawable() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HL EZpvd() {
        return this.copydefault;
    }

    public Drawable(java.lang.String str, @NotNull HL hl, InterfaceC3972Aw interfaceC3972Aw, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(hl, "");
        this.OLrzqt = str;
        this.copydefault = hl;
        this.valueOf = str2;
        this.KWHzl = interfaceC3972Aw == null;
        interfaceC3972Aw = interfaceC3972Aw == null ? C3919Av.DefaultHttpEngine$default(null, 1, null) : interfaceC3972Aw;
        this.AEQbTJ = interfaceC3972Aw;
        C54914xa c54914xa = new C54914xa(new InputType(new DefaultChainCredentialsProvider$chain$1(hl)), new Environment(new DefaultChainCredentialsProvider$chain$2(hl)), new Looper(str, str2, hl, interfaceC3972Aw, null, 16, null), new InputFilter(hl, interfaceC3972Aw, str2), new MediaController(hl, interfaceC3972Aw), new IBinder(null, C56392yDr.copydefault(new Function0<InterruptedIOException>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.DefaultChainCredentialsProvider$chain$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final InterruptedIOException invoke() {
                InterruptedIOException.ActionBar actionBar = InterruptedIOException.copydefault;
                final Drawable drawable = this.this$0;
                return actionBar.KWHzl(new Function1<InterruptedIOException.Activity, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.DefaultChainCredentialsProvider$chain$3.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(InterruptedIOException.Activity activity) {
                        invoke2(activity);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull InterruptedIOException.Activity activity) {
                        Intrinsics.checkNotNullParameter(activity, "");
                        activity.AEQbTJ(drawable.EZpvd());
                        activity.KWHzl(drawable.AEQbTJ);
                    }
                });
            }
        }), hl, null, 9, null));
        this.EZpvd = c54914xa;
        this.AhwBna = new C52751wX(c54914xa, 0L, 0L, null, 14, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:o.HL:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.HL:0x000c: INVOKE (wrap:o.HL$TaskDescription:0x000a: SGET  A[WRAPPED] (LINE:46) o.HL.OLrzqt o.HL$TaskDescription) VIRTUAL call: o.HL.TaskDescription.copydefault():o.HL A[MD:():o.HL (m), WRAPPED] (LINE:46)) : (r3v0 o.HL))
  (wrap:o.Aw:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.Aw) : (r4v0 o.Aw))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, o.HL, o.Aw, java.lang.String):void (m)] (LINE:44) call: o.Drawable.<init>(java.lang.String, o.HL, o.Aw, java.lang.String):void type: THIS */
    public /* synthetic */ Drawable(java.lang.String str, HL hl, InterfaceC3972Aw interfaceC3972Aw, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? HL.OLrzqt.copydefault() : hl, (i & 4) != 0 ? null : interfaceC3972Aw, (i & 8) != 0 ? null : str2);
    }

    @Override // o.InterfaceC52805wZ, o.InterfaceC5045Cp
    public java.lang.Object resolve(@NotNull InterfaceC57843yq interfaceC57843yq, @NotNull Continuation<? super InterfaceC52697wV> continuation) {
        return this.AhwBna.resolve(interfaceC57843yq, continuation);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.AhwBna.close();
        if (this.KWHzl) {
            CB.copydefault(this.AEQbTJ);
        }
    }
}
