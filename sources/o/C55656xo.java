package o;

import aws.smithy.kotlin.runtime.auth.awssigning.AwsSignatureType;
import aws.smithy.kotlin.runtime.auth.awssigning.AwsSignedBodyHeader;
import aws.smithy.kotlin.runtime.auth.awssigning.DefaultCanonicalizer$1;
import aws.smithy.kotlin.runtime.auth.awssigning.DefaultCanonicalizer$calculateHash$1;
import aws.smithy.kotlin.runtime.auth.awssigning.DefaultCanonicalizer$calculateHash$3;
import aws.smithy.kotlin.runtime.auth.awssigning.DefaultCanonicalizer$canonicalRequest$1;
import aws.smithy.kotlin.runtime.auth.awssigning.DefaultCanonicalizer$sha256$1;
import aws.smithy.kotlin.runtime.time.TimestampFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC55709xp;
import o.C5167Hh;
import o.C55603xn;
import o.C56390yDp;
import o.DN;
import o.zP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C55656xo implements InterfaceC55391xj {
    public final Function0<InterfaceC59908zr> EZpvd;

    /* JADX INFO: renamed from: o.xo$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AwsSignatureType.values().length];
            try {
                iArr[AwsSignatureType.HTTP_REQUEST_VIA_HEADERS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AwsSignatureType.HTTP_REQUEST_VIA_QUERY_PARAMS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C55656xo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function0<? extends o.zr> */
    /* JADX WARN: Multi-variable type inference failed */
    public C55656xo(@NotNull Function0<? extends InterfaceC59908zr> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function0:0x0004: SGET  A[WRAPPED] (LINE:73) aws.smithy.kotlin.runtime.auth.awssigning.DefaultCanonicalizer$1.INSTANCE aws.smithy.kotlin.runtime.auth.awssigning.DefaultCanonicalizer$1) : (r1v0 kotlin.jvm.functions.Function0))
 A[MD:(kotlin.jvm.functions.Function0<? extends o.zr>):void (m)] (LINE:73) call: o.xo.<init>(kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C55656xo(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DefaultCanonicalizer$1.INSTANCE : function0);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a3 A[LOOP:0: B:38:0x019d->B:40:0x01a3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC55391xj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull InterfaceC5037Ch interfaceC5037Ch, @NotNull C55338xi c55338xi, @NotNull Continuation<? super C55444xk> continuation) throws java.lang.Throwable {
        DefaultCanonicalizer$canonicalRequest$1 defaultCanonicalizer$canonicalRequest$1;
        java.lang.String strKWHzl;
        InterfaceC5037Ch interfaceC5037Ch2;
        final C55338xi c55338xi2;
        java.util.Iterator it;
        if (continuation instanceof DefaultCanonicalizer$canonicalRequest$1) {
            defaultCanonicalizer$canonicalRequest$1 = (DefaultCanonicalizer$canonicalRequest$1) continuation;
            int i = defaultCanonicalizer$canonicalRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultCanonicalizer$canonicalRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultCanonicalizer$canonicalRequest$1 = new DefaultCanonicalizer$canonicalRequest$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = defaultCanonicalizer$canonicalRequest$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = defaultCanonicalizer$canonicalRequest$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            AbstractC55709xp abstractC55709xpCopydefault = c55338xi.copydefault();
            if (!(abstractC55709xpCopydefault instanceof AbstractC55709xp.StateListAnimator)) {
                if (!(abstractC55709xpCopydefault instanceof AbstractC55709xp.ActionBar)) {
                    throw new NoWhenBranchMatchedException();
                }
                strKWHzl = ((AbstractC55709xp.ActionBar) abstractC55709xpCopydefault).KWHzl();
                interfaceC5037Ch2 = interfaceC5037Ch;
                c55338xi2 = c55338xi;
                boolean z = c55338xi2.DbNXlk() != AwsSignatureType.HTTP_REQUEST_VIA_QUERY_PARAMS;
                boolean z2 = z && c55338xi2.values() == AwsSignedBodyHeader.X_AMZ_CONTENT_SHA256;
                java.lang.String strDjBIcL = c55338xi2.OLrzqt().djBIcL();
                C5036Cg c5036CgEZpvd = C5043Cn.EZpvd(interfaceC5037Ch2);
                C55338xi c55338xi3 = c55338xi2;
                AEQbTJ(c55338xi3, c5036CgEZpvd, "Host", c5036CgEZpvd.djBIcL().AEQbTJ(), !z, false);
                boolean z3 = z;
                canonicalRequest$param$default(c55338xi3, c5036CgEZpvd, "X-Amz-Algorithm", "AWS4-HMAC-SHA256", z3, false, 32, null);
                canonicalRequest$param$default(c55338xi3, c5036CgEZpvd, "X-Amz-Credential", C55815xr.AEQbTJ(c55338xi2), z3, false, 32, null);
                canonicalRequest$param$default(c55338xi3, c5036CgEZpvd, "X-Amz-Content-Sha256", strKWHzl, z2, false, 32, null);
                canonicalRequest$param$default(c55338xi2, c5036CgEZpvd, "X-Amz-Date", c55338xi2.isConnected().OLrzqt(TimestampFormat.ISO_8601_CONDENSED), false, false, 48, null);
                C59462zhW c59462zhWAEQbTJ = c55338xi2.AEQbTJ();
                canonicalRequest$param$default(c55338xi2, c5036CgEZpvd, "X-Amz-Expires", c59462zhWAEQbTJ == null ? C56443yFo.KWHzl(C59462zhW.DbNXlk(c59462zhWAEQbTJ.copydefault())).toString() : null, z, false, 32, null);
                canonicalRequest$param$default(c55338xi2, c5036CgEZpvd, "X-Amz-Security-Token", strDjBIcL, !c55338xi2.AYXKKw(), false, 32, null);
                Sequence sequenceKWHzl = C59467zhb.KWHzl(C59467zhb.fetchVPNInfo(C59467zhb.DbNXlk(CollectionsKt___CollectionsKt.QVAiDq(c5036CgEZpvd.AEQbTJ().copydefault()), new Function1<Map.Entry<? extends java.lang.String, ? extends java.util.List<? extends java.lang.String>>, java.lang.Boolean>() { // from class: aws.smithy.kotlin.runtime.auth.awssigning.DefaultCanonicalizer$canonicalRequest$headers$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(1);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Boolean invoke2(@NotNull Map.Entry<String, ? extends List<String>> entry) {
                        Intrinsics.checkNotNullParameter(entry, "");
                        return Boolean.valueOf(C55603xn.OLrzqt(entry.getKey(), c55338xi2));
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Map.Entry<? extends String, ? extends List<? extends String>> entry) {
                        return invoke2((Map.Entry<String, ? extends List<String>>) entry);
                    }
                }), new Function1<Map.Entry<? extends java.lang.String, ? extends java.util.List<? extends java.lang.String>>, kotlin.Pair<? extends java.lang.String, ? extends java.util.List<? extends java.lang.String>>>() { // from class: aws.smithy.kotlin.runtime.auth.awssigning.DefaultCanonicalizer$canonicalRequest$headers$2
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Pair<? extends String, ? extends List<? extends String>> invoke(Map.Entry<? extends String, ? extends List<? extends String>> entry) {
                        return invoke2((Map.Entry<String, ? extends List<String>>) entry);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Pair<String, List<String>> invoke2(@NotNull Map.Entry<String, ? extends List<String>> entry) {
                        Intrinsics.checkNotNullParameter(entry, "");
                        String lowerCase = entry.getKey().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                        return C56390yDp.OLrzqt(lowerCase, entry.getValue());
                    }
                }), (java.util.Comparator) new Application());
                java.lang.String strJoinToString$default = C59467zhb.joinToString$default(sequenceKWHzl, ";", null, null, 0, null, new Function1<kotlin.Pair<? extends java.lang.String, ? extends java.util.List<? extends java.lang.String>>, java.lang.CharSequence>() { // from class: aws.smithy.kotlin.runtime.auth.awssigning.DefaultCanonicalizer$canonicalRequest$signedHeaders$1
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final CharSequence invoke2(@NotNull Pair<String, ? extends List<String>> pair) {
                        Intrinsics.checkNotNullParameter(pair, "");
                        return pair.getFirst();
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ CharSequence invoke(Pair<? extends String, ? extends List<? extends String>> pair) {
                        return invoke2((Pair<String, ? extends List<String>>) pair);
                    }
                }, 30, null);
                canonicalRequest$param$default(c55338xi2, c5036CgEZpvd, "X-Amz-SignedHeaders", strJoinToString$default, z, false, 32, null);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(c5036CgEZpvd.EZpvd().name());
                Intrinsics.checkNotNullExpressionValue(sb, "");
                sb.append('\n');
                Intrinsics.checkNotNullExpressionValue(sb, "");
                sb.append(C55603xn.EZpvd(c5036CgEZpvd.djBIcL(), c55338xi2));
                Intrinsics.checkNotNullExpressionValue(sb, "");
                sb.append('\n');
                Intrinsics.checkNotNullExpressionValue(sb, "");
                sb.append(C55603xn.copydefault(c5036CgEZpvd.djBIcL()));
                Intrinsics.checkNotNullExpressionValue(sb, "");
                sb.append('\n');
                Intrinsics.checkNotNullExpressionValue(sb, "");
                it = C59467zhb.fetchVPNInfo(sequenceKWHzl, new Function1<kotlin.Pair<? extends java.lang.String, ? extends java.util.List<? extends java.lang.String>>, java.lang.String>() { // from class: aws.smithy.kotlin.runtime.auth.awssigning.DefaultCanonicalizer$canonicalRequest$requestString$1$1
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ String invoke(Pair<? extends String, ? extends List<? extends String>> pair) {
                        return invoke2((Pair<String, ? extends List<String>>) pair);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String invoke2(@NotNull Pair<String, ? extends List<String>> pair) {
                        Intrinsics.checkNotNullParameter(pair, "");
                        return C55603xn.KWHzl((Pair<String, ? extends List<String>>) pair);
                    }
                }).iterator();
                while (it.hasNext()) {
                    sb.append((java.lang.String) it.next());
                    Intrinsics.checkNotNullExpressionValue(sb, "");
                    sb.append('\n');
                    Intrinsics.checkNotNullExpressionValue(sb, "");
                }
                sb.append('\n');
                Intrinsics.checkNotNullExpressionValue(sb, "");
                sb.append(strJoinToString$default);
                Intrinsics.checkNotNullExpressionValue(sb, "");
                sb.append('\n');
                Intrinsics.checkNotNullExpressionValue(sb, "");
                sb.append(strKWHzl);
                java.lang.String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                canonicalRequest$param$default(c55338xi2, c5036CgEZpvd, "X-Amz-Security-Token", strDjBIcL, c55338xi2.AYXKKw(), false, 32, null);
                return new C55444xk(c5036CgEZpvd, string, strJoinToString$default, strKWHzl);
            }
            zP zPVarKWHzl = interfaceC5037Ch.KWHzl();
            defaultCanonicalizer$canonicalRequest$1.L$0 = interfaceC5037Ch;
            defaultCanonicalizer$canonicalRequest$1.L$1 = c55338xi;
            defaultCanonicalizer$canonicalRequest$1.label = 1;
            objOLrzqt = OLrzqt(zPVarKWHzl, defaultCanonicalizer$canonicalRequest$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            interfaceC5037Ch2 = interfaceC5037Ch;
            c55338xi2 = c55338xi;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c55338xi2 = (C55338xi) defaultCanonicalizer$canonicalRequest$1.L$1;
            interfaceC5037Ch2 = (InterfaceC5037Ch) defaultCanonicalizer$canonicalRequest$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        strKWHzl = (java.lang.String) objOLrzqt;
        if (c55338xi2.DbNXlk() != AwsSignatureType.HTTP_REQUEST_VIA_QUERY_PARAMS) {
        }
        if (z) {
        }
        java.lang.String strDjBIcL2 = c55338xi2.OLrzqt().djBIcL();
        C5036Cg c5036CgEZpvd2 = C5043Cn.EZpvd(interfaceC5037Ch2);
        C55338xi c55338xi32 = c55338xi2;
        AEQbTJ(c55338xi32, c5036CgEZpvd2, "Host", c5036CgEZpvd2.djBIcL().AEQbTJ(), !z, false);
        boolean z32 = z;
        canonicalRequest$param$default(c55338xi32, c5036CgEZpvd2, "X-Amz-Algorithm", "AWS4-HMAC-SHA256", z32, false, 32, null);
        canonicalRequest$param$default(c55338xi32, c5036CgEZpvd2, "X-Amz-Credential", C55815xr.AEQbTJ(c55338xi2), z32, false, 32, null);
        canonicalRequest$param$default(c55338xi32, c5036CgEZpvd2, "X-Amz-Content-Sha256", strKWHzl, z2, false, 32, null);
        canonicalRequest$param$default(c55338xi2, c5036CgEZpvd2, "X-Amz-Date", c55338xi2.isConnected().OLrzqt(TimestampFormat.ISO_8601_CONDENSED), false, false, 48, null);
        C59462zhW c59462zhWAEQbTJ2 = c55338xi2.AEQbTJ();
        canonicalRequest$param$default(c55338xi2, c5036CgEZpvd2, "X-Amz-Expires", c59462zhWAEQbTJ2 == null ? C56443yFo.KWHzl(C59462zhW.DbNXlk(c59462zhWAEQbTJ2.copydefault())).toString() : null, z, false, 32, null);
        canonicalRequest$param$default(c55338xi2, c5036CgEZpvd2, "X-Amz-Security-Token", strDjBIcL2, !c55338xi2.AYXKKw(), false, 32, null);
        Sequence sequenceKWHzl2 = C59467zhb.KWHzl(C59467zhb.fetchVPNInfo(C59467zhb.DbNXlk(CollectionsKt___CollectionsKt.QVAiDq(c5036CgEZpvd2.AEQbTJ().copydefault()), new Function1<Map.Entry<? extends java.lang.String, ? extends java.util.List<? extends java.lang.String>>, java.lang.Boolean>() { // from class: aws.smithy.kotlin.runtime.auth.awssigning.DefaultCanonicalizer$canonicalRequest$headers$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Boolean invoke2(@NotNull Map.Entry<String, ? extends List<String>> entry) {
                Intrinsics.checkNotNullParameter(entry, "");
                return Boolean.valueOf(C55603xn.OLrzqt(entry.getKey(), c55338xi2));
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Map.Entry<? extends String, ? extends List<? extends String>> entry) {
                return invoke2((Map.Entry<String, ? extends List<String>>) entry);
            }
        }), new Function1<Map.Entry<? extends java.lang.String, ? extends java.util.List<? extends java.lang.String>>, kotlin.Pair<? extends java.lang.String, ? extends java.util.List<? extends java.lang.String>>>() { // from class: aws.smithy.kotlin.runtime.auth.awssigning.DefaultCanonicalizer$canonicalRequest$headers$2
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Pair<? extends String, ? extends List<? extends String>> invoke(Map.Entry<? extends String, ? extends List<? extends String>> entry) {
                return invoke2((Map.Entry<String, ? extends List<String>>) entry);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Pair<String, List<String>> invoke2(@NotNull Map.Entry<String, ? extends List<String>> entry) {
                Intrinsics.checkNotNullParameter(entry, "");
                String lowerCase = entry.getKey().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                return C56390yDp.OLrzqt(lowerCase, entry.getValue());
            }
        }), (java.util.Comparator) new Application());
        java.lang.String strJoinToString$default2 = C59467zhb.joinToString$default(sequenceKWHzl2, ";", null, null, 0, null, new Function1<kotlin.Pair<? extends java.lang.String, ? extends java.util.List<? extends java.lang.String>>, java.lang.CharSequence>() { // from class: aws.smithy.kotlin.runtime.auth.awssigning.DefaultCanonicalizer$canonicalRequest$signedHeaders$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final CharSequence invoke2(@NotNull Pair<String, ? extends List<String>> pair) {
                Intrinsics.checkNotNullParameter(pair, "");
                return pair.getFirst();
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Pair<? extends String, ? extends List<? extends String>> pair) {
                return invoke2((Pair<String, ? extends List<String>>) pair);
            }
        }, 30, null);
        canonicalRequest$param$default(c55338xi2, c5036CgEZpvd2, "X-Amz-SignedHeaders", strJoinToString$default2, z, false, 32, null);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(c5036CgEZpvd2.EZpvd().name());
        Intrinsics.checkNotNullExpressionValue(sb2, "");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "");
        sb2.append(C55603xn.EZpvd(c5036CgEZpvd2.djBIcL(), c55338xi2));
        Intrinsics.checkNotNullExpressionValue(sb2, "");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "");
        sb2.append(C55603xn.copydefault(c5036CgEZpvd2.djBIcL()));
        Intrinsics.checkNotNullExpressionValue(sb2, "");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "");
        it = C59467zhb.fetchVPNInfo(sequenceKWHzl2, new Function1<kotlin.Pair<? extends java.lang.String, ? extends java.util.List<? extends java.lang.String>>, java.lang.String>() { // from class: aws.smithy.kotlin.runtime.auth.awssigning.DefaultCanonicalizer$canonicalRequest$requestString$1$1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ String invoke(Pair<? extends String, ? extends List<? extends String>> pair) {
                return invoke2((Pair<String, ? extends List<String>>) pair);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String invoke2(@NotNull Pair<String, ? extends List<String>> pair) {
                Intrinsics.checkNotNullParameter(pair, "");
                return C55603xn.KWHzl((Pair<String, ? extends List<String>>) pair);
            }
        }).iterator();
        while (it.hasNext()) {
        }
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "");
        sb2.append(strJoinToString$default2);
        Intrinsics.checkNotNullExpressionValue(sb2, "");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "");
        sb2.append(strKWHzl);
        java.lang.String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        canonicalRequest$param$default(c55338xi2, c5036CgEZpvd2, "X-Amz-Security-Token", strDjBIcL2, c55338xi2.AYXKKw(), false, 32, null);
        return new C55444xk(c5036CgEZpvd2, string2, strJoinToString$default2, strKWHzl);
    }

    public static /* synthetic */ void canonicalRequest$param$default(C55338xi c55338xi, C5036Cg c5036Cg, java.lang.String str, java.lang.String str2, boolean z, boolean z2, int i, java.lang.Object obj) {
        AEQbTJ(c55338xi, c5036Cg, str, str2, (i & 16) != 0 ? true : z, (i & 32) != 0 ? true : z2);
    }

    public static final void AEQbTJ(C55338xi c55338xi, C5036Cg c5036Cg, java.lang.String str, java.lang.String str2, boolean z, boolean z2) {
        if (!z || str2 == null) {
            return;
        }
        int i = Activity.copydefault[c55338xi.DbNXlk().ordinal()];
        if (i == 1) {
            if (z2 || !c5036Cg.AEQbTJ().AEQbTJ(str)) {
                c5036Cg.AEQbTJ().EZpvd(str, str2);
                return;
            }
            return;
        }
        if (i == 2) {
            DN.StateListAnimator stateListAnimatorEZpvd = c5036Cg.djBIcL().EZpvd();
            if (z2 || !stateListAnimatorEZpvd.AEQbTJ().containsKey(str)) {
                stateListAnimatorEZpvd.AEQbTJ().remove(str);
                C5167Hh.ActionBar actionBar = C5167Hh.KWHzl;
                stateListAnimatorEZpvd.OLrzqt(actionBar.AhwBna().AEQbTJ(str), actionBar.AhwBna().AEQbTJ(str2));
                return;
            }
            return;
        }
        throw new NotImplementedError("An operation is not implemented: " + ("Support for " + c55338xi.DbNXlk() + " is not yet implemented"));
    }

    /* JADX INFO: renamed from: o.xo$Application */
    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl((java.lang.String) ((kotlin.Pair) t).getFirst(), (java.lang.String) ((kotlin.Pair) t2).getFirst());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(zP zPVar, Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        DefaultCanonicalizer$calculateHash$1 defaultCanonicalizer$calculateHash$1;
        if (continuation instanceof DefaultCanonicalizer$calculateHash$1) {
            defaultCanonicalizer$calculateHash$1 = (DefaultCanonicalizer$calculateHash$1) continuation;
            int i = defaultCanonicalizer$calculateHash$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultCanonicalizer$calculateHash$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultCanonicalizer$calculateHash$1 = new DefaultCanonicalizer$calculateHash$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = defaultCanonicalizer$calculateHash$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = defaultCanonicalizer$calculateHash$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objWithContext);
                return C5165Hf.AEQbTJ((byte[]) objWithContext);
            }
            if (i2 == 2) {
                C56391yDq.AEQbTJ(objWithContext);
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objWithContext);
        if (!(!zPVar.b_())) {
            throw new java.lang.IllegalArgumentException("Stream must be replayable to calculate a body hash".toString());
        }
        if (zPVar instanceof zP.StateListAnimator) {
            return AbstractC55709xp.Application.copydefault.KWHzl();
        }
        if (zPVar instanceof zP.TaskDescription) {
            return C5165Hf.AEQbTJ(C59971zt.copydefault(((zP.TaskDescription) zPVar).OLrzqt(), this.EZpvd));
        }
        if (zPVar instanceof zP.Activity) {
            CS csCopydefault = ((zP.Activity) zPVar).copydefault();
            defaultCanonicalizer$calculateHash$1.label = 1;
            objWithContext = KWHzl(csCopydefault, defaultCanonicalizer$calculateHash$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            return C5165Hf.AEQbTJ((byte[]) objWithContext);
        }
        if (zPVar instanceof zP.Application) {
            InterfaceC5060De interfaceC5060DeCopydefault = ((zP.Application) zPVar).copydefault();
            CoroutineDispatcher coroutineDispatcherAEQbTJ = C5070Do.OLrzqt.AEQbTJ();
            DefaultCanonicalizer$calculateHash$3 defaultCanonicalizer$calculateHash$3 = new DefaultCanonicalizer$calculateHash$3(this, interfaceC5060DeCopydefault, null);
            defaultCanonicalizer$calculateHash$1.label = 2;
            objWithContext = BuildersKt.withContext(coroutineDispatcherAEQbTJ, defaultCanonicalizer$calculateHash$3, defaultCanonicalizer$calculateHash$1);
            return objWithContext == objCopydefault ? objCopydefault : objWithContext;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(CS cs, Continuation<? super byte[]> continuation) throws java.lang.Throwable {
        DefaultCanonicalizer$sha256$1 defaultCanonicalizer$sha256$1;
        InterfaceC59908zr interfaceC59908zr;
        if (continuation instanceof DefaultCanonicalizer$sha256$1) {
            defaultCanonicalizer$sha256$1 = (DefaultCanonicalizer$sha256$1) continuation;
            int i = defaultCanonicalizer$sha256$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultCanonicalizer$sha256$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultCanonicalizer$sha256$1 = new DefaultCanonicalizer$sha256$1(this, continuation);
            }
        }
        java.lang.Object obj = defaultCanonicalizer$sha256$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = defaultCanonicalizer$sha256$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC59908zr interfaceC59908zrInvoke = this.EZpvd.invoke();
            CH ch = new CH(interfaceC59908zrInvoke, null, 2, null);
            defaultCanonicalizer$sha256$1.L$0 = interfaceC59908zrInvoke;
            defaultCanonicalizer$sha256$1.label = 1;
            if (CV.KWHzl(cs, ch, defaultCanonicalizer$sha256$1) == objCopydefault) {
                return objCopydefault;
            }
            interfaceC59908zr = interfaceC59908zrInvoke;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC59908zr = (InterfaceC59908zr) defaultCanonicalizer$sha256$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        return interfaceC59908zr.AEQbTJ();
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, MOVE_EXCEPTION, THROW, THROW, INVOKE, MOVE_EXCEPTION, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 0, expect 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final byte[] OLrzqt(InterfaceC5060De interfaceC5060De) throws java.io.IOException {
        InterfaceC59908zr interfaceC59908zrInvoke = this.EZpvd.invoke();
        CO coAEQbTJ = CX.AEQbTJ(new CH(interfaceC59908zrInvoke, null, 2, null));
        try {
            try {
                coAEQbTJ.KWHzl(interfaceC5060De);
                interfaceC5060De.close();
                coAEQbTJ.close();
                return interfaceC59908zrInvoke.AEQbTJ();
            } finally {
            }
        } catch (java.lang.Throwable th) {
            try {
                coAEQbTJ.close();
            } catch (java.lang.Throwable th2) {
                C56379yDe.EZpvd(th, th2);
            }
            throw th;
        }
    }
}
