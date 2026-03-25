package o;

import aws.smithy.kotlin.runtime.auth.awssigning.AwsSignatureType;
import aws.smithy.kotlin.runtime.auth.awssigning.AwsSignedBodyHeader;
import aws.smithy.kotlin.runtime.auth.awssigning.AwsSigningAlgorithm;
import aws.smithy.kotlin.runtime.http.auth.AwsHttpSigner$sign$1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import o.AbstractC54779xV;
import o.AbstractC55709xp;
import o.C55338xi;
import o.zP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Aa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2808Aa implements InterfaceC3179Ah {
    public static final ActionBar EZpvd = new ActionBar(null);
    public final TaskDescription OLrzqt;

    /* JADX INFO: renamed from: o.Aa$TaskDescription */
    public static final class TaskDescription {
        public boolean AEQbTJ;
        public InterfaceC55285xh AhwBna;
        public C59462zhW EZpvd;
        public boolean OLrzqt;
        public java.lang.String djBIcL;
        public AwsSignatureType AYXKKw = AwsSignatureType.HTTP_REQUEST_VIA_HEADERS;
        public AwsSigningAlgorithm KWHzl = AwsSigningAlgorithm.SIGV4;
        public boolean values = true;
        public boolean copydefault = true;
        public AwsSignedBodyHeader valueOf = AwsSignedBodyHeader.NONE;
        public Function1<? super java.lang.String, java.lang.Boolean> gEmmrt = new Function1<java.lang.String, java.lang.Boolean>() { // from class: aws.smithy.kotlin.runtime.http.auth.AwsHttpSigner$Config$shouldSignHeader$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return Boolean.TRUE;
            }
        };

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.djBIcL = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC55285xh AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AwsSignedBodyHeader AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C59462zhW EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AwsSigningAlgorithm KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(InterfaceC55285xh interfaceC55285xh) {
            this.AhwBna = interfaceC55285xh;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean djBIcL() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean fetchVPNInfo() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Boolean>, kotlin.jvm.functions.Function1<java.lang.String, java.lang.Boolean> */
        public final Function1<java.lang.String, java.lang.Boolean> gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AwsSignatureType valueOf() {
            return this.AYXKKw;
        }
    }

    public C2808Aa(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.OLrzqt = taskDescription;
    }

    /* JADX INFO: renamed from: o.Aa$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Aa.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC3179Ah
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull C3126Ag c3126Ag, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AwsHttpSigner$sign$1 awsHttpSigner$sign$1;
        C5036Cg c5036CgAEQbTJ;
        C55338xi c55338xi;
        InterfaceC57843yq interfaceC57843yq;
        C2808Aa c2808Aa;
        AbstractC55709xp abstractC55709xp;
        java.util.Set set;
        if (continuation instanceof AwsHttpSigner$sign$1) {
            awsHttpSigner$sign$1 = (AwsHttpSigner$sign$1) continuation;
            int i = awsHttpSigner$sign$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                awsHttpSigner$sign$1.label = i - Integer.MIN_VALUE;
            } else {
                awsHttpSigner$sign$1 = new AwsHttpSigner$sign$1(this, continuation);
            }
        }
        java.lang.Object obj = awsHttpSigner$sign$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = awsHttpSigner$sign$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!(c3126Ag.copydefault() instanceof InterfaceC52697wV)) {
                throw new java.lang.IllegalArgumentException(("invalid Identity type " + C56524yIo.AEQbTJ(c3126Ag.copydefault().getClass()) + "; expected " + C56524yIo.AEQbTJ(InterfaceC52697wV.class)).toString());
            }
            InterfaceC57843yq interfaceC57843yqKWHzl = c3126Ag.KWHzl();
            c5036CgAEQbTJ = c3126Ag.AEQbTJ();
            zP zPVarKWHzl = c5036CgAEQbTJ.KWHzl();
            C55232xg c55232xg = C55232xg.EZpvd;
            AbstractC55709xp abstractC55709xp2 = (AbstractC55709xp) interfaceC57843yqKWHzl.OLrzqt(c55232xg.EZpvd());
            AwsSignedBodyHeader awsSignedBodyHeaderAhwBna = (AwsSignedBodyHeader) interfaceC57843yqKWHzl.OLrzqt(c55232xg.OLrzqt());
            java.lang.String str = (java.lang.String) C58108yv.OLrzqt(interfaceC57843yqKWHzl, c55232xg.gEmmrt());
            java.util.Set set2 = (java.util.Set) interfaceC57843yqKWHzl.OLrzqt(c55232xg.djBIcL());
            java.lang.Boolean bool = (java.lang.Boolean) interfaceC57843yqKWHzl.OLrzqt(c55232xg.valueOf());
            java.lang.Boolean bool2 = (java.lang.Boolean) interfaceC57843yqKWHzl.OLrzqt(c55232xg.AEQbTJ());
            java.lang.String strAEQbTJ = (java.lang.String) interfaceC57843yqKWHzl.OLrzqt(c55232xg.AYXKKw());
            C55338xi.StateListAnimator stateListAnimator = C55338xi.AEQbTJ;
            C55338xi.Activity activity = new C55338xi.Activity();
            if (strAEQbTJ == null && (strAEQbTJ = this.OLrzqt.AEQbTJ()) == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            activity.EZpvd(strAEQbTJ);
            InterfaceC5047Cr interfaceC5047CrCopydefault = c3126Ag.copydefault();
            Intrinsics.copydefault(interfaceC5047CrCopydefault, "");
            activity.AEQbTJ((InterfaceC52697wV) interfaceC5047CrCopydefault);
            activity.AEQbTJ(this.OLrzqt.KWHzl());
            activity.AEQbTJ((activity.AEQbTJ() != AwsSigningAlgorithm.SIGV4_ASYMMETRIC || (set = set2) == null || set.isEmpty()) ? str : CollectionsKt___CollectionsKt.joinToString$default(set2, ",", null, null, 0, null, null, 62, null));
            C5173Hn c5173HnCopydefault = (C5173Hn) interfaceC57843yqKWHzl.OLrzqt(c55232xg.AhwBna());
            if (c5173HnCopydefault == null) {
                C5173Hn c5173HnKWHzl = C5173Hn.AEQbTJ.KWHzl();
                C59462zhW c59462zhW = (C59462zhW) interfaceC57843yqKWHzl.OLrzqt(BC.copydefault.EZpvd());
                c5173HnCopydefault = c5173HnKWHzl.copydefault(c59462zhW != null ? c59462zhW.copydefault() : C59462zhW.OLrzqt.KWHzl());
            }
            activity.copydefault(c5173HnCopydefault);
            activity.copydefault(this.OLrzqt.valueOf());
            activity.KWHzl(this.OLrzqt.OLrzqt());
            activity.copydefault(bool2 != null ? bool2.booleanValue() : this.OLrzqt.copydefault());
            activity.OLrzqt(bool != null ? bool.booleanValue() : this.OLrzqt.djBIcL());
            activity.OLrzqt(this.OLrzqt.EZpvd());
            activity.copydefault(this.OLrzqt.gEmmrt());
            if (awsSignedBodyHeaderAhwBna == null) {
                awsSignedBodyHeaderAhwBna = this.OLrzqt.AhwBna();
            }
            activity.AEQbTJ(awsSignedBodyHeaderAhwBna);
            AbstractC54779xV abstractC54779xV = (AbstractC54779xV) interfaceC57843yqKWHzl.OLrzqt(C57578yl.EZpvd.EZpvd());
            activity.EZpvd(abstractC54779xV != null && abstractC54779xV.KWHzl(AbstractC54779xV.Activity.KWHzl));
            if (abstractC55709xp2 == null) {
                if (zPVarKWHzl instanceof zP.StateListAnimator) {
                    abstractC55709xp2 = AbstractC55709xp.Application.copydefault;
                } else if (C54265xC.KWHzl(zPVarKWHzl)) {
                    if (c5036CgAEQbTJ.AEQbTJ().AEQbTJ("x-amz-trailer")) {
                        abstractC55709xp = this.OLrzqt.fetchVPNInfo() ? AbstractC55709xp.FragmentManager.AEQbTJ : AbstractC55709xp.TaskDescription.EZpvd;
                    } else {
                        abstractC55709xp = AbstractC55709xp.Activity.copydefault;
                    }
                    abstractC55709xp2 = abstractC55709xp;
                } else {
                    abstractC55709xp2 = this.OLrzqt.fetchVPNInfo() ? AbstractC55709xp.LoaderManager.copydefault : AbstractC55709xp.StateListAnimator.OLrzqt;
                }
            }
            activity.OLrzqt(abstractC55709xp2);
            C55338xi c55338xiEZpvd = activity.EZpvd();
            if (C54265xC.KWHzl(c55338xiEZpvd)) {
                C54265xC.OLrzqt(c5036CgAEQbTJ);
            }
            InterfaceC55285xh interfaceC55285xhAYXKKw = this.OLrzqt.AYXKKw();
            if (interfaceC55285xhAYXKKw == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
            InterfaceC5037Ch interfaceC5037ChCopydefault = c5036CgAEQbTJ.copydefault();
            awsHttpSigner$sign$1.L$0 = this;
            awsHttpSigner$sign$1.L$1 = interfaceC57843yqKWHzl;
            awsHttpSigner$sign$1.L$2 = c5036CgAEQbTJ;
            awsHttpSigner$sign$1.L$3 = c55338xiEZpvd;
            awsHttpSigner$sign$1.label = 1;
            java.lang.Object objKWHzl = interfaceC55285xhAYXKKw.KWHzl(interfaceC5037ChCopydefault, c55338xiEZpvd, awsHttpSigner$sign$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c55338xi = c55338xiEZpvd;
            interfaceC57843yq = interfaceC57843yqKWHzl;
            obj = objKWHzl;
            c2808Aa = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c55338xi = (C55338xi) awsHttpSigner$sign$1.L$3;
            c5036CgAEQbTJ = (C5036Cg) awsHttpSigner$sign$1.L$2;
            interfaceC57843yq = (InterfaceC57843yq) awsHttpSigner$sign$1.L$1;
            c2808Aa = (C2808Aa) awsHttpSigner$sign$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        C55497xl c55497xl = (C55497xl) obj;
        InterfaceC5037Ch interfaceC5037Ch = (InterfaceC5037Ch) c55497xl.AEQbTJ();
        CompletableDeferred completableDeferred = (CompletableDeferred) interfaceC57843yq.OLrzqt(C55232xg.EZpvd.KWHzl());
        if (completableDeferred != null) {
            C56443yFo.KWHzl(completableDeferred.complete(c55497xl.OLrzqt()));
        }
        zY.AEQbTJ(c5036CgAEQbTJ, interfaceC5037Ch);
        if (C54265xC.KWHzl(c55338xi)) {
            InterfaceC55285xh interfaceC55285xhAYXKKw2 = c2808Aa.OLrzqt.AYXKKw();
            if (interfaceC55285xhAYXKKw2 != null) {
                C54265xC.EZpvd(c5036CgAEQbTJ, interfaceC55285xhAYXKKw2, c55338xi, c55497xl.OLrzqt(), c5036CgAEQbTJ.AhwBna().djBIcL());
            } else {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
        }
        return Unit.INSTANCE;
    }
}
