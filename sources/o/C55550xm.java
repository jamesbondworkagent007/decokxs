package o;

import aws.smithy.kotlin.runtime.auth.awssigning.AwsSigningAlgorithm;
import aws.smithy.kotlin.runtime.auth.awssigning.DefaultAwsSignerImpl$sign$1;
import aws.smithy.kotlin.runtime.auth.awssigning.UnsupportedSigningAlgorithmException;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.InterfaceC5148Go;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C55550xm implements InterfaceC55285xh {
    public final InterfaceC55921xt AEQbTJ;
    public final InterfaceC56027xv EZpvd;
    public final InterfaceC55391xj KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C55550xm() {
        this(null, null, null, 7, null);
    }

    public C55550xm(@NotNull InterfaceC55391xj interfaceC55391xj, @NotNull InterfaceC55921xt interfaceC55921xt, @NotNull InterfaceC56027xv interfaceC56027xv) {
        Intrinsics.checkNotNullParameter(interfaceC55391xj, "");
        Intrinsics.checkNotNullParameter(interfaceC55921xt, "");
        Intrinsics.checkNotNullParameter(interfaceC56027xv, "");
        this.KWHzl = interfaceC55391xj;
        this.AEQbTJ = interfaceC55921xt;
        this.EZpvd = interfaceC56027xv;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (wrap:o.xj:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.xj:0x0006: INVOKE (wrap:o.xj$StateListAnimator:0x0004: SGET  A[WRAPPED] (LINE:17) o.xj.OLrzqt o.xj$StateListAnimator) VIRTUAL call: o.xj.StateListAnimator.KWHzl():o.xo A[MD:():o.xo (m), WRAPPED] (LINE:17)) : (r1v0 o.xj))
  (wrap:o.xt:?: TERNARY null = ((wrap:int:0x000a: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.xt:0x0010: INVOKE (wrap:o.xt$StateListAnimator:0x000e: SGET  A[WRAPPED] (LINE:18) o.xt.copydefault o.xt$StateListAnimator) VIRTUAL call: o.xt.StateListAnimator.OLrzqt():o.xs A[MD:():o.xs (m), WRAPPED] (LINE:18)) : (r2v0 o.xt))
  (wrap:o.xv:?: TERNARY null = ((wrap:int:0x0014: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.xv:0x001a: INVOKE (wrap:o.xv$StateListAnimator:0x0018: SGET  A[WRAPPED] (LINE:19) o.xv.AEQbTJ o.xv$StateListAnimator) VIRTUAL call: o.xv.StateListAnimator.KWHzl():o.xq A[MD:():o.xq (m), WRAPPED] (LINE:19)) : (r3v0 o.xv))
 A[MD:(o.xj, o.xt, o.xv):void (m)] (LINE:16) call: o.xm.<init>(o.xj, o.xt, o.xv):void type: THIS */
    public /* synthetic */ C55550xm(InterfaceC55391xj interfaceC55391xj, InterfaceC55921xt interfaceC55921xt, InterfaceC56027xv interfaceC56027xv, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InterfaceC55391xj.OLrzqt.KWHzl() : interfaceC55391xj, (i & 2) != 0 ? InterfaceC55921xt.copydefault.OLrzqt() : interfaceC55921xt, (i & 4) != 0 ? InterfaceC56027xv.AEQbTJ.KWHzl() : interfaceC56027xv);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC55285xh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull InterfaceC5037Ch interfaceC5037Ch, @NotNull C55338xi c55338xi, @NotNull Continuation<? super C55497xl<InterfaceC5037Ch>> continuation) throws java.lang.Throwable {
        DefaultAwsSignerImpl$sign$1 defaultAwsSignerImpl$sign$1;
        C55550xm c55550xm;
        InterfaceC5148Go interfaceC5148Go;
        if (continuation instanceof DefaultAwsSignerImpl$sign$1) {
            defaultAwsSignerImpl$sign$1 = (DefaultAwsSignerImpl$sign$1) continuation;
            int i = defaultAwsSignerImpl$sign$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultAwsSignerImpl$sign$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultAwsSignerImpl$sign$1 = new DefaultAwsSignerImpl$sign$1(this, continuation);
            }
        }
        java.lang.Object obj = defaultAwsSignerImpl$sign$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = defaultAwsSignerImpl$sign$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineContext context = defaultAwsSignerImpl$sign$1.getContext();
            java.lang.String strGEmmrt = C56524yIo.AEQbTJ(C55550xm.class).gEmmrt();
            if (strGEmmrt == null) {
                throw new java.lang.IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
            }
            InterfaceC5148Go interfaceC5148GoOLrzqt = C5141Gh.OLrzqt(context, strGEmmrt);
            if (c55338xi.EZpvd() != AwsSigningAlgorithm.SIGV4) {
                throw new UnsupportedSigningAlgorithmException(c55338xi.EZpvd() + " support is not yet implemented for the default signer.", c55338xi.EZpvd());
            }
            InterfaceC55391xj interfaceC55391xj = this.KWHzl;
            defaultAwsSignerImpl$sign$1.L$0 = this;
            defaultAwsSignerImpl$sign$1.L$1 = c55338xi;
            defaultAwsSignerImpl$sign$1.L$2 = interfaceC5148GoOLrzqt;
            defaultAwsSignerImpl$sign$1.label = 1;
            java.lang.Object objOLrzqt = interfaceC55391xj.OLrzqt(interfaceC5037Ch, c55338xi, defaultAwsSignerImpl$sign$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c55550xm = this;
            obj = objOLrzqt;
            interfaceC5148Go = interfaceC5148GoOLrzqt;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC5148Go = (InterfaceC5148Go) defaultAwsSignerImpl$sign$1.L$2;
            c55338xi = (C55338xi) defaultAwsSignerImpl$sign$1.L$1;
            c55550xm = (C55550xm) defaultAwsSignerImpl$sign$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        final C55444xk c55444xk = (C55444xk) obj;
        if (c55338xi.KWHzl()) {
            InterfaceC5148Go.TaskDescription.trace$default(interfaceC5148Go, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.auth.awssigning.DefaultAwsSignerImpl$sign$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Canonical request:\n" + c55444xk.EZpvd();
                }
            }, 1, null);
        }
        final java.lang.String strKWHzl = c55550xm.AEQbTJ.KWHzl(c55444xk.EZpvd(), c55338xi);
        InterfaceC5148Go.TaskDescription.trace$default(interfaceC5148Go, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.auth.awssigning.DefaultAwsSignerImpl$sign$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "String to sign:\n" + strKWHzl;
            }
        }, 1, null);
        final java.lang.String strEZpvd = c55550xm.AEQbTJ.EZpvd(c55550xm.AEQbTJ.KWHzl(c55338xi), strKWHzl);
        InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148Go, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.auth.awssigning.DefaultAwsSignerImpl$sign$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Calculated signature: " + strEZpvd;
            }
        }, 1, null);
        return new C55497xl(c55550xm.EZpvd.OLrzqt(c55338xi, c55444xk, strEZpvd), C59449zhJ.getNewProxyInstance(strEZpvd));
    }

    @Override // o.InterfaceC55285xh
    public java.lang.Object OLrzqt(@NotNull byte[] bArr, @NotNull byte[] bArr2, @NotNull C55338xi c55338xi, @NotNull Continuation<? super C55497xl<Unit>> continuation) {
        CoroutineContext context = continuation.getContext();
        java.lang.String strGEmmrt = C56524yIo.AEQbTJ(C55550xm.class).gEmmrt();
        if (strGEmmrt == null) {
            throw new java.lang.IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
        }
        InterfaceC5148Go interfaceC5148GoOLrzqt = C5141Gh.OLrzqt(context, strGEmmrt);
        final java.lang.String strOLrzqt = this.AEQbTJ.OLrzqt(bArr, bArr2, c55338xi);
        InterfaceC5148Go.TaskDescription.trace$default(interfaceC5148GoOLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.auth.awssigning.DefaultAwsSignerImpl$signChunk$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Chunk string to sign:\n" + strOLrzqt;
            }
        }, 1, null);
        final java.lang.String strEZpvd = this.AEQbTJ.EZpvd(this.AEQbTJ.KWHzl(c55338xi), strOLrzqt);
        InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148GoOLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.auth.awssigning.DefaultAwsSignerImpl$signChunk$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Calculated chunk signature: " + strEZpvd;
            }
        }, 1, null);
        return new C55497xl(Unit.INSTANCE, C59449zhJ.getNewProxyInstance(strEZpvd));
    }

    @Override // o.InterfaceC55285xh
    public java.lang.Object KWHzl(@NotNull InterfaceC58725zN interfaceC58725zN, @NotNull byte[] bArr, @NotNull C55338xi c55338xi, @NotNull Continuation<? super C55497xl<Unit>> continuation) {
        CoroutineContext context = continuation.getContext();
        java.lang.String strGEmmrt = C56524yIo.AEQbTJ(C55550xm.class).gEmmrt();
        if (strGEmmrt == null) {
            throw new java.lang.IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
        }
        InterfaceC5148Go interfaceC5148GoOLrzqt = C5141Gh.OLrzqt(context, strGEmmrt);
        java.util.List<Map.Entry> listEZpvd = CollectionsKt___CollectionsKt.EZpvd(interfaceC58725zN.AEQbTJ(), new Activity());
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        for (Map.Entry entry : listEZpvd) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String lowerCase = ((java.lang.String) entry.getKey()).toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            sb.append(lowerCase);
            sb.append(":");
            sb.append(CollectionsKt___CollectionsKt.joinToString$default((java.lang.Iterable) entry.getValue(), ",", null, null, 0, null, new Function1<java.lang.String, java.lang.CharSequence>() { // from class: aws.smithy.kotlin.runtime.auth.awssigning.DefaultAwsSignerImpl$signChunkTrailer$trailingHeadersBytes$2$1$1
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                public final CharSequence invoke(@NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "");
                    return StringsKt__StringsKt.hDKMBd((CharSequence) str).toString();
                }
            }, 30, null));
            sb.append("\n");
            java.lang.String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            arrayList.add(C59449zhJ.getNewProxyInstance(string));
        }
        java.util.Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
        }
        java.lang.Object next = it.next();
        while (it.hasNext()) {
            next = yDT.copydefault((byte[]) next, (byte[]) it.next());
        }
        final java.lang.String strKWHzl = this.AEQbTJ.KWHzl((byte[]) next, bArr, c55338xi);
        InterfaceC5148Go.TaskDescription.trace$default(interfaceC5148GoOLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.auth.awssigning.DefaultAwsSignerImpl$signChunkTrailer$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Chunk trailer string to sign:\n" + strKWHzl;
            }
        }, 1, null);
        final java.lang.String strEZpvd = this.AEQbTJ.EZpvd(this.AEQbTJ.KWHzl(c55338xi), strKWHzl);
        InterfaceC5148Go.TaskDescription.debug$default(interfaceC5148GoOLrzqt, null, new Function0<java.lang.String>() { // from class: aws.smithy.kotlin.runtime.auth.awssigning.DefaultAwsSignerImpl$signChunkTrailer$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Calculated chunk signature: " + strEZpvd;
            }
        }, 1, null);
        return new C55497xl(Unit.INSTANCE, C59449zhJ.getNewProxyInstance(strEZpvd));
    }

    /* JADX INFO: renamed from: o.xm$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.String str = (java.lang.String) ((Map.Entry) t).getKey();
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            java.lang.String lowerCase2 = ((java.lang.String) ((Map.Entry) t2).getKey()).toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            return yET.KWHzl(lowerCase, lowerCase2);
        }
    }
}
