package o;

import com.google.gson.JsonObject;
import com.okinc.business.market.features.share.domain.ShareUseCase$getTokenShareInfo$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ktn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29447ktn {
    public final InterfaceC29449ktp EZpvd;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C29447ktn(@NotNull InterfaceC29449ktp interfaceC29449ktp) {
        Intrinsics.checkNotNullParameter(interfaceC29449ktp, "");
        this.EZpvd = interfaceC29449ktp;
    }

    public static /* synthetic */ java.lang.Object getTokenShareInfo$default(C29447ktn c29447ktn, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str4 = null;
        }
        return c29447ktn.OLrzqt(str, str2, str3, str4, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, @NotNull Continuation<? super C22398hec> continuation) throws java.lang.Throwable {
        ShareUseCase$getTokenShareInfo$1 shareUseCase$getTokenShareInfo$1;
        C29447ktn c29447ktn;
        java.lang.String str5;
        JsonObject jsonObject;
        if (continuation instanceof ShareUseCase$getTokenShareInfo$1) {
            shareUseCase$getTokenShareInfo$1 = (ShareUseCase$getTokenShareInfo$1) continuation;
            int i = shareUseCase$getTokenShareInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                shareUseCase$getTokenShareInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                shareUseCase$getTokenShareInfo$1 = new ShareUseCase$getTokenShareInfo$1(this, continuation);
            }
        }
        ShareUseCase$getTokenShareInfo$1 shareUseCase$getTokenShareInfo$12 = shareUseCase$getTokenShareInfo$1;
        java.lang.Object objCopydefault = shareUseCase$getTokenShareInfo$12.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = shareUseCase$getTokenShareInfo$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            InterfaceC29449ktp interfaceC29449ktp = this.EZpvd;
            shareUseCase$getTokenShareInfo$12.L$0 = this;
            shareUseCase$getTokenShareInfo$12.L$1 = str;
            shareUseCase$getTokenShareInfo$12.L$2 = str2;
            shareUseCase$getTokenShareInfo$12.L$3 = str3;
            shareUseCase$getTokenShareInfo$12.L$4 = str4;
            shareUseCase$getTokenShareInfo$12.label = 1;
            objCopydefault = interfaceC29449ktp.copydefault(str, str2, shareUseCase$getTokenShareInfo$12);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c29447ktn = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jsonObject = (JsonObject) shareUseCase$getTokenShareInfo$12.L$1;
                str5 = (java.lang.String) shareUseCase$getTokenShareInfo$12.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                return new C22398hec(jsonObject, (java.util.List) ((AbstractC43419rot) objCopydefault).copydefault(), str5);
            }
            str4 = (java.lang.String) shareUseCase$getTokenShareInfo$12.L$4;
            str3 = (java.lang.String) shareUseCase$getTokenShareInfo$12.L$3;
            str2 = (java.lang.String) shareUseCase$getTokenShareInfo$12.L$2;
            str = (java.lang.String) shareUseCase$getTokenShareInfo$12.L$1;
            c29447ktn = (C29447ktn) shareUseCase$getTokenShareInfo$12.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        JsonObject jsonObject2 = (JsonObject) ((AbstractC43419rot) objCopydefault).copydefault();
        java.lang.String str6 = (str4 == null || str4.length() == 0) ? str2 : str4;
        InterfaceC29449ktp interfaceC29449ktp2 = c29447ktn.EZpvd;
        shareUseCase$getTokenShareInfo$12.L$0 = str3;
        shareUseCase$getTokenShareInfo$12.L$1 = jsonObject2;
        shareUseCase$getTokenShareInfo$12.L$2 = null;
        shareUseCase$getTokenShareInfo$12.L$3 = null;
        shareUseCase$getTokenShareInfo$12.L$4 = null;
        shareUseCase$getTokenShareInfo$12.label = 2;
        java.lang.Object objKWHzl = interfaceC29449ktp2.KWHzl(str, str6, null, null, "5m", "288", shareUseCase$getTokenShareInfo$12);
        if (objKWHzl == objCopydefault2) {
            return objCopydefault2;
        }
        str5 = str3;
        objCopydefault = objKWHzl;
        jsonObject = jsonObject2;
        return new C22398hec(jsonObject, (java.util.List) ((AbstractC43419rot) objCopydefault).copydefault(), str5);
    }

    /* JADX INFO: renamed from: o.ktn$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ktn.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
