package o;

import com.okinc.auth.impl.passkey.domain.FinishPasskeyUpgradeUseCase$execute$1;
import com.okinc.auth.impl.passkey.model.RegistrationStartResponse;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5945aFz {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final C58924zUm AEQbTJ;
    public final C5691aBJ copydefault;

    @yCM
    public C5945aFz(@NotNull C58924zUm c58924zUm, @NotNull C5691aBJ c5691aBJ) {
        Intrinsics.checkNotNullParameter(c58924zUm, "");
        Intrinsics.checkNotNullParameter(c5691aBJ, "");
        this.AEQbTJ = c58924zUm;
        this.copydefault = c5691aBJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0141 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(android.content.Context context, @NotNull RegistrationStartResponse registrationStartResponse, @NotNull Continuation<? super Result<Unit>> continuation) {
        FinishPasskeyUpgradeUseCase$execute$1 finishPasskeyUpgradeUseCase$execute$1;
        RegistrationStartResponse registrationStartResponse2;
        C5945aFz c5945aFz;
        java.util.List<java.lang.String> listAhwBna;
        java.util.List<RegistrationStartResponse.PublicKey.CredentialDescriptor> excludeCredentials;
        RegistrationStartResponse.PublicKey.User user;
        RegistrationStartResponse.PublicKey.User user2;
        RegistrationStartResponse.PublicKey.Rp rp;
        android.content.Context context2 = context;
        if (continuation instanceof FinishPasskeyUpgradeUseCase$execute$1) {
            finishPasskeyUpgradeUseCase$execute$1 = (FinishPasskeyUpgradeUseCase$execute$1) continuation;
            int i = finishPasskeyUpgradeUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                finishPasskeyUpgradeUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                finishPasskeyUpgradeUseCase$execute$1 = new FinishPasskeyUpgradeUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = finishPasskeyUpgradeUseCase$execute$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = finishPasskeyUpgradeUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            C5691aBJ c5691aBJ = this.copydefault;
            finishPasskeyUpgradeUseCase$execute$1.L$0 = this;
            finishPasskeyUpgradeUseCase$execute$1.L$1 = context2;
            registrationStartResponse2 = registrationStartResponse;
            finishPasskeyUpgradeUseCase$execute$1.L$2 = registrationStartResponse2;
            finishPasskeyUpgradeUseCase$execute$1.label = 1;
            objCopydefault = c5691aBJ.copydefault(context2, finishPasskeyUpgradeUseCase$execute$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c5945aFz = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
                return ((Result) objCopydefault).m7386unboximpl();
            }
            RegistrationStartResponse registrationStartResponse3 = (RegistrationStartResponse) finishPasskeyUpgradeUseCase$execute$1.L$2;
            android.content.Context context3 = (android.content.Context) finishPasskeyUpgradeUseCase$execute$1.L$1;
            c5945aFz = (C5945aFz) finishPasskeyUpgradeUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            registrationStartResponse2 = registrationStartResponse3;
            context2 = context3;
        }
        java.lang.String str = (java.lang.String) objCopydefault;
        java.lang.String strKWHzl = C34703nhO.KWHzl(context2);
        finishPasskeyUpgradeUseCase$execute$1.L$0 = c5945aFz;
        finishPasskeyUpgradeUseCase$execute$1.L$1 = registrationStartResponse2;
        finishPasskeyUpgradeUseCase$execute$1.L$2 = str;
        finishPasskeyUpgradeUseCase$execute$1.L$3 = strKWHzl;
        finishPasskeyUpgradeUseCase$execute$1.label = 2;
        C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(finishPasskeyUpgradeUseCase$execute$1));
        pUU.KWHzl("FinishPasskeyUpgradeUseCase", " finish upgrade upgradeInteractor.finishUpgrade");
        C58924zUm c58924zUm = c5945aFz.AEQbTJ;
        RegistrationStartResponse.PublicKey publicKey = registrationStartResponse2.getPublicKey();
        java.lang.String id = null;
        java.lang.String id2 = (publicKey == null || (rp = publicKey.getRp()) == null) ? null : rp.getId();
        java.lang.String str2 = id2 == null ? "" : id2;
        RegistrationStartResponse.PublicKey publicKey2 = registrationStartResponse2.getPublicKey();
        java.lang.String challenge = publicKey2 != null ? publicKey2.getChallenge() : null;
        java.lang.String str3 = challenge == null ? "" : challenge;
        RegistrationStartResponse.PublicKey publicKey3 = registrationStartResponse2.getPublicKey();
        java.lang.String name = (publicKey3 == null || (user2 = publicKey3.getUser()) == null) ? null : user2.getName();
        java.lang.String str4 = name == null ? "" : name;
        RegistrationStartResponse.PublicKey publicKey4 = registrationStartResponse2.getPublicKey();
        if (publicKey4 != null && (user = publicKey4.getUser()) != null) {
            id = user.getId();
        }
        java.lang.String str5 = id == null ? "" : id;
        RegistrationStartResponse.PublicKey publicKey5 = registrationStartResponse2.getPublicKey();
        if (publicKey5 == null || (excludeCredentials = publicKey5.getExcludeCredentials()) == null) {
            listAhwBna = yDY.AhwBna();
            c58924zUm.copydefault(str2, str3, str4, str5, listAhwBna, str, strKWHzl, new StateListAnimator(c56434yFf));
            objCopydefault = c56434yFf.KWHzl();
            if (objCopydefault == C56442yFn.copydefault()) {
                C56447yFs.copydefault(finishPasskeyUpgradeUseCase$execute$1);
            }
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = excludeCredentials.iterator();
            while (it.hasNext()) {
                java.lang.String id3 = ((RegistrationStartResponse.PublicKey.CredentialDescriptor) it.next()).getId();
                if (id3 != null) {
                    arrayList.add(id3);
                }
            }
            listAhwBna = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
            if (listAhwBna == null) {
            }
            c58924zUm.copydefault(str2, str3, str4, str5, listAhwBna, str, strKWHzl, new StateListAnimator(c56434yFf));
            objCopydefault = c56434yFf.KWHzl();
            if (objCopydefault == C56442yFn.copydefault()) {
            }
            if (objCopydefault == objCopydefault2) {
            }
        }
        return ((Result) objCopydefault).m7386unboximpl();
    }

    /* JADX INFO: renamed from: o.aFz$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC58915zUd {
        public final /* synthetic */ Continuation<Result<Unit>> OLrzqt;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(Continuation<? super Result<Unit>> continuation) {
            this.OLrzqt = continuation;
        }

        @Override // o.InterfaceC58915zUd
        public void copydefault() {
            pUU.KWHzl("FinishPasskeyUpgradeUseCase", "finish upgrade success");
            Continuation<Result<Unit>> continuation = this.OLrzqt;
            Result.Application application = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(Result.m7376boximpl(Result.m7377constructorimpl(Unit.INSTANCE))));
        }

        @Override // o.InterfaceC58915zUd
        public void KWHzl(C60231zyo c60231zyo) {
            Intrinsics.checkNotNullParameter(c60231zyo, "");
            pUU.copydefault("FinishPasskeyUpgradeUseCase", "finish upgrade error: " + c60231zyo.copydefault());
            Continuation<Result<Unit>> continuation = this.OLrzqt;
            Result.Application application = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.Exception(c60231zyo.copydefault()))))));
        }
    }

    /* JADX INFO: renamed from: o.aFz$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFz.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
