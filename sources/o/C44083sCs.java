package o;

import com.okinc.okex.uploadlog.bean.ElementValue;
import com.okinc.okex.uploadlog.bean.TicketFieldElement;
import com.okinc.okex.uploadlog.bean.TicketSubmitRequest;
import com.okinc.okex.uploadlog.usecase.BuildSubmitTicketRequestUseCase$invoke$1;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.sCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sCs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44083sCs {
    public final C44088sCx AEQbTJ;
    public final java.lang.String EZpvd;
    public final C44086sCv KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    @yCM
    public C44083sCs(@NotNull C44088sCx c44088sCx, @NotNull C44086sCv c44086sCv) {
        Intrinsics.checkNotNullParameter(c44088sCx, "");
        Intrinsics.checkNotNullParameter(c44086sCv, "");
        this.AEQbTJ = c44088sCx;
        this.KWHzl = c44086sCv;
        this.EZpvd = "SUCCESS";
        this.copydefault = "UPLOAD_FAIL";
        this.OLrzqt = "RETRIEVE_EMPTY_LOG";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v6, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v23, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v1, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.util.Map<java.lang.String, ? extends ElementValue> map, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super TicketSubmitRequest> continuation) throws java.lang.Throwable {
        BuildSubmitTicketRequestUseCase$invoke$1 buildSubmitTicketRequestUseCase$invoke$1;
        Ref.ObjectRef objectRef;
        C44083sCs c44083sCs;
        java.lang.Object objCopydefault;
        java.lang.Object objM7377constructorimpl;
        Ref.ObjectRef objectRef2;
        java.lang.String str3;
        java.lang.String str4;
        final java.lang.Throwable thM7380exceptionOrNullimpl;
        java.io.File file;
        java.util.Map<java.lang.String, ? extends ElementValue> map2;
        C44083sCs c44083sCs2;
        java.lang.String strOLrzqt;
        final sCR scr;
        if (continuation instanceof BuildSubmitTicketRequestUseCase$invoke$1) {
            buildSubmitTicketRequestUseCase$invoke$1 = (BuildSubmitTicketRequestUseCase$invoke$1) continuation;
            int i = buildSubmitTicketRequestUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                buildSubmitTicketRequestUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                buildSubmitTicketRequestUseCase$invoke$1 = new BuildSubmitTicketRequestUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = buildSubmitTicketRequestUseCase$invoke$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = buildSubmitTicketRequestUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            try {
                Result.Application application = Result.Companion;
                C44088sCx c44088sCx = this.AEQbTJ;
                buildSubmitTicketRequestUseCase$invoke$1.L$0 = this;
                buildSubmitTicketRequestUseCase$invoke$1.L$1 = map;
                buildSubmitTicketRequestUseCase$invoke$1.L$2 = str;
                buildSubmitTicketRequestUseCase$invoke$1.L$3 = str2;
                buildSubmitTicketRequestUseCase$invoke$1.L$4 = objectRef;
                buildSubmitTicketRequestUseCase$invoke$1.label = 1;
                objCopydefault = c44088sCx.copydefault(buildSubmitTicketRequestUseCase$invoke$1);
            } catch (java.lang.Throwable th) {
                th = th;
                c44083sCs = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                Ref.ObjectRef objectRef3 = objectRef;
                java.util.Map<java.lang.String, ? extends ElementValue> map3 = map;
                objectRef2 = objectRef3;
                java.lang.String str5 = str2;
                str3 = str;
                str4 = str5;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                }
                file = (java.io.File) objM7377constructorimpl;
                if (file == null) {
                }
            }
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c44083sCs = this;
            objM7377constructorimpl = Result.m7377constructorimpl((java.io.File) objCopydefault);
            Ref.ObjectRef objectRef32 = objectRef;
            java.util.Map<java.lang.String, ? extends ElementValue> map32 = map;
            objectRef2 = objectRef32;
            java.lang.String str52 = str2;
            str3 = str;
            str4 = str52;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            }
            file = (java.io.File) objM7377constructorimpl;
            if (file == null) {
            }
        } else if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef2 = (Ref.ObjectRef) buildSubmitTicketRequestUseCase$invoke$1.L$4;
            str4 = (java.lang.String) buildSubmitTicketRequestUseCase$invoke$1.L$3;
            str3 = (java.lang.String) buildSubmitTicketRequestUseCase$invoke$1.L$2;
            map2 = (java.util.Map) buildSubmitTicketRequestUseCase$invoke$1.L$1;
            c44083sCs2 = (C44083sCs) buildSubmitTicketRequestUseCase$invoke$1.L$0;
            C56391yDq.AEQbTJ(obj);
            scr = (sCR) obj;
            if (!(scr instanceof sCR.ActionBar)) {
                objectRef2.element = c44083sCs2.copydefault;
                C44760scx.log$default("BuildSubmitTicketRequestUseCase: Upload debug log files loading", null, 2, null);
            } else if (scr instanceof sCR.StateListAnimator) {
                objectRef2.element = c44083sCs2.EZpvd;
                C44760scx.log$default("BuildSubmitTicketRequestUseCase: Upload debug log files success", null, 2, null);
                strOLrzqt = ((sCR.StateListAnimator) scr).OLrzqt();
            } else {
                if (!(scr instanceof sCR.Application)) {
                    throw new NoWhenBranchMatchedException();
                }
                objectRef2.element = c44083sCs2.copydefault;
                C44760scx.copydefault("BuildSubmitTicketRequestUseCase: Failed to upload app logs", new Function1() { // from class: o.sCw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return C44083sCs.KWHzl(scr, (C44761scy) obj2);
                    }
                });
            }
            strOLrzqt = null;
        } else {
            Ref.ObjectRef objectRef4 = (Ref.ObjectRef) buildSubmitTicketRequestUseCase$invoke$1.L$4;
            str2 = (java.lang.String) buildSubmitTicketRequestUseCase$invoke$1.L$3;
            str = (java.lang.String) buildSubmitTicketRequestUseCase$invoke$1.L$2;
            java.util.Map<java.lang.String, ? extends ElementValue> map4 = (java.util.Map) buildSubmitTicketRequestUseCase$invoke$1.L$1;
            c44083sCs = (C44083sCs) buildSubmitTicketRequestUseCase$invoke$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                objectRef = objectRef4;
                map = map4;
                objCopydefault = obj;
                try {
                    objM7377constructorimpl = Result.m7377constructorimpl((java.io.File) objCopydefault);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    Result.Application application22 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            } catch (java.lang.Throwable th3) {
                objectRef = objectRef4;
                map = map4;
                th = th3;
                Result.Application application222 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                Ref.ObjectRef objectRef322 = objectRef;
                java.util.Map<java.lang.String, ? extends ElementValue> map322 = map;
                objectRef2 = objectRef322;
                java.lang.String str522 = str2;
                str3 = str;
                str4 = str522;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                }
                file = (java.io.File) objM7377constructorimpl;
                if (file == null) {
                }
            }
            Ref.ObjectRef objectRef3222 = objectRef;
            java.util.Map<java.lang.String, ? extends ElementValue> map3222 = map;
            objectRef2 = objectRef3222;
            java.lang.String str5222 = str2;
            str3 = str;
            str4 = str5222;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                objectRef2.element = c44083sCs.OLrzqt;
                C44760scx.copydefault("BuildSubmitTicketRequestUseCase: Failed to retrieve app logs", new Function1() { // from class: o.sCr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return C44083sCs.KWHzl(thM7380exceptionOrNullimpl, (C44761scy) obj2);
                    }
                });
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            file = (java.io.File) objM7377constructorimpl;
            if (file == null) {
                C44760scx.log$default("BuildSubmitTicketRequestUseCase: Upload debug log files: " + file.getName(), null, 2, null);
                C44086sCv c44086sCv = c44083sCs.KWHzl;
                buildSubmitTicketRequestUseCase$invoke$1.L$0 = c44083sCs;
                buildSubmitTicketRequestUseCase$invoke$1.L$1 = map3222;
                buildSubmitTicketRequestUseCase$invoke$1.L$2 = str3;
                buildSubmitTicketRequestUseCase$invoke$1.L$3 = str4;
                buildSubmitTicketRequestUseCase$invoke$1.L$4 = objectRef2;
                buildSubmitTicketRequestUseCase$invoke$1.label = 2;
                java.lang.Object objKWHzl = c44086sCv.KWHzl(file, buildSubmitTicketRequestUseCase$invoke$1);
                if (objKWHzl == objCopydefault2) {
                    return objCopydefault2;
                }
                map2 = map3222;
                obj = objKWHzl;
                c44083sCs2 = c44083sCs;
                scr = (sCR) obj;
                if (!(scr instanceof sCR.ActionBar)) {
                }
                strOLrzqt = null;
            } else {
                map2 = map3222;
                strOLrzqt = null;
            }
        }
        java.util.List listValueOf = yDY.valueOf(strOLrzqt != null ? new TicketFieldElement(str3, new ElementValue.ElementString(strOLrzqt)) : null, new TicketFieldElement(str4, new ElementValue.ElementString((java.lang.String) objectRef2.element)));
        java.util.ArrayList arrayList = new java.util.ArrayList(map2.size());
        for (Map.Entry<java.lang.String, ? extends ElementValue> entry : map2.entrySet()) {
            arrayList.add(new TicketFieldElement(entry.getKey(), entry.getValue()));
        }
        TicketSubmitRequest ticketSubmitRequest = new TicketSubmitRequest(arrayList, listValueOf);
        C44760scx.log$default("BuildSubmitTicketRequestUseCase: ticket request: " + ticketSubmitRequest, null, 2, null);
        return ticketSubmitRequest;
    }

    public static final Unit KWHzl(java.lang.Throwable th, C44761scy c44761scy) {
        Intrinsics.checkNotNullParameter(c44761scy, "");
        c44761scy.KWHzl(th);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(sCR scr, C44761scy c44761scy) {
        Intrinsics.checkNotNullParameter(c44761scy, "");
        c44761scy.KWHzl(((sCR.Application) scr).copydefault());
        return Unit.INSTANCE;
    }
}
