package com.okinc.business.invest_biz.ui.screens.defi_dashboard.use_case;

import com.okinc.business.invest_biz.ui.screens.defi_dashboard.model.DashboardListMode;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C24193iYi;
import o.C26360jap;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC24202iYr;
import o.InterfaceC26357jam;
import o.InterfaceC26359jao;
import o.InterfaceC26362jar;
import o.pUU;

/* JADX INFO: loaded from: classes6.dex */
public final class DashboardContentUseCaseImpl$invoke$2 extends SuspendLambda implements Function1<Continuation<? super InterfaceC24202iYr>, Object> {
    final /* synthetic */ long $chainId;
    boolean Z$0;
    boolean Z$1;
    int label;
    final /* synthetic */ C26360jap this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardContentUseCaseImpl$invoke$2(C26360jap c26360jap, long j, Continuation<? super DashboardContentUseCaseImpl$invoke$2> continuation) {
        super(1, continuation);
        this.this$0 = c26360jap;
        this.$chainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DashboardContentUseCaseImpl$invoke$2(this.this$0, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super InterfaceC24202iYr> continuation) {
        return ((DashboardContentUseCaseImpl$invoke$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zAEQbTJ;
        Object objCopydefault;
        boolean z;
        boolean zEZpvd;
        Object objKWHzl;
        boolean z2;
        Object objCopydefault2;
        InterfaceC24202iYr interfaceC24202iYr;
        Object objKWHzl2;
        boolean zEZpvd2;
        Object objCopydefault3 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            zAEQbTJ = C24193iYi.OLrzqt.AEQbTJ();
            InterfaceC26357jam interfaceC26357jam = this.this$0.OLrzqt;
            this.Z$0 = zAEQbTJ;
            this.label = 1;
            objCopydefault = interfaceC26357jam.copydefault(this);
            if (objCopydefault == objCopydefault3) {
                return objCopydefault3;
            }
        } else if (i == 1) {
            zAEQbTJ = this.Z$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        } else if (i == 2) {
            boolean z3 = this.Z$1;
            z2 = this.Z$0;
            C56391yDq.AEQbTJ(obj);
            zEZpvd = z3;
            objKWHzl = obj;
            interfaceC24202iYr = (InterfaceC24202iYr) ((Pair) objKWHzl).getSecond();
            if (!z2) {
            }
            pUU.copydefault("zxf ", "shouldShowTabArrow=" + zEZpvd2);
            if (!(interfaceC24202iYr instanceof InterfaceC24202iYr.TaskDescription)) {
            }
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z4 = this.Z$1;
                z2 = this.Z$0;
                C56391yDq.AEQbTJ(obj);
                zEZpvd = z4;
                objKWHzl2 = obj;
                interfaceC24202iYr = (InterfaceC24202iYr) objKWHzl2;
                if (!z2 && zEZpvd && !(interfaceC24202iYr instanceof InterfaceC24202iYr.LoaderManager)) {
                    if (!(interfaceC24202iYr instanceof InterfaceC24202iYr.TaskDescription)) {
                        zEZpvd2 = ((InterfaceC24202iYr.TaskDescription) interfaceC24202iYr).EZpvd();
                    } else if (interfaceC24202iYr instanceof InterfaceC24202iYr.Fragment) {
                        zEZpvd2 = ((InterfaceC24202iYr.Fragment) interfaceC24202iYr).copydefault();
                    } else {
                        zEZpvd2 = interfaceC24202iYr instanceof InterfaceC24202iYr.Application ? ((InterfaceC24202iYr.Application) interfaceC24202iYr).EZpvd() : false;
                    }
                }
                pUU.copydefault("zxf ", "shouldShowTabArrow=" + zEZpvd2);
                return !(interfaceC24202iYr instanceof InterfaceC24202iYr.TaskDescription) ? InterfaceC24202iYr.TaskDescription.copy$default((InterfaceC24202iYr.TaskDescription) interfaceC24202iYr, null, zEZpvd2, 1, null) : interfaceC24202iYr instanceof InterfaceC24202iYr.Fragment ? InterfaceC24202iYr.Fragment.copy$default((InterfaceC24202iYr.Fragment) interfaceC24202iYr, null, zEZpvd2, 1, null) : interfaceC24202iYr instanceof InterfaceC24202iYr.LoaderManager ? InterfaceC24202iYr.LoaderManager.copy$default((InterfaceC24202iYr.LoaderManager) interfaceC24202iYr, null, zEZpvd2, 1, null) : interfaceC24202iYr instanceof InterfaceC24202iYr.Application ? InterfaceC24202iYr.Application.copy$default((InterfaceC24202iYr.Application) interfaceC24202iYr, false, zEZpvd2, 1, null) : interfaceC24202iYr;
            }
            boolean z5 = this.Z$1;
            boolean z6 = this.Z$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault2 = ((Result) obj).m7386unboximpl();
            zEZpvd = z5;
            z = z6;
            if (Result.m7383isFailureimpl(objCopydefault2)) {
                objCopydefault2 = null;
            }
            DashboardListMode dashboardListMode = (DashboardListMode) objCopydefault2;
            C26360jap c26360jap = this.this$0;
            long j = this.$chainId;
            this.Z$0 = z;
            this.Z$1 = zEZpvd;
            this.label = 4;
            objKWHzl2 = c26360jap.KWHzl(dashboardListMode, j, true, this);
            if (objKWHzl2 != objCopydefault3) {
                return objCopydefault3;
            }
            z2 = z;
            interfaceC24202iYr = (InterfaceC24202iYr) objKWHzl2;
            if (!z2) {
                if (!(interfaceC24202iYr instanceof InterfaceC24202iYr.TaskDescription)) {
                }
            }
            pUU.copydefault("zxf ", "shouldShowTabArrow=" + zEZpvd2);
            if (!(interfaceC24202iYr instanceof InterfaceC24202iYr.TaskDescription)) {
            }
        }
        z = zAEQbTJ;
        if (Result.m7383isFailureimpl(objCopydefault)) {
            objCopydefault = null;
        }
        zEZpvd = Intrinsics.EZpvd(objCopydefault, C56443yFo.KWHzl(true));
        if (z || !zEZpvd) {
            InterfaceC26362jar interfaceC26362jar = this.this$0.AEQbTJ;
            DashboardListMode dashboardListMode2 = DashboardListMode.PROTOCOL;
            long j2 = this.$chainId;
            this.Z$0 = z;
            this.Z$1 = zEZpvd;
            this.label = 2;
            objKWHzl = interfaceC26362jar.KWHzl(dashboardListMode2, j2, zEZpvd, this);
            if (objKWHzl == objCopydefault3) {
                return objCopydefault3;
            }
            z2 = z;
            interfaceC24202iYr = (InterfaceC24202iYr) ((Pair) objKWHzl).getSecond();
            if (!z2) {
            }
            pUU.copydefault("zxf ", "shouldShowTabArrow=" + zEZpvd2);
            if (!(interfaceC24202iYr instanceof InterfaceC24202iYr.TaskDescription)) {
            }
        } else {
            InterfaceC26359jao interfaceC26359jao = this.this$0.AhwBna;
            this.Z$0 = z;
            this.Z$1 = zEZpvd;
            this.label = 3;
            objCopydefault2 = interfaceC26359jao.copydefault(this);
            if (objCopydefault2 == objCopydefault3) {
                return objCopydefault3;
            }
            if (Result.m7383isFailureimpl(objCopydefault2)) {
            }
            DashboardListMode dashboardListMode3 = (DashboardListMode) objCopydefault2;
            C26360jap c26360jap2 = this.this$0;
            long j3 = this.$chainId;
            this.Z$0 = z;
            this.Z$1 = zEZpvd;
            this.label = 4;
            objKWHzl2 = c26360jap2.KWHzl(dashboardListMode3, j3, true, this);
            if (objKWHzl2 != objCopydefault3) {
            }
        }
    }
}
