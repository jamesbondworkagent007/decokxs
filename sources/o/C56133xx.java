package o;

import aws.smithy.kotlin.runtime.auth.awssigning.AwsSignatureType;
import aws.smithy.kotlin.runtime.auth.awssigning.AwsSignedBodyHeader;
import aws.smithy.kotlin.runtime.auth.awssigning.PresignerKt$presignRequest$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC55709xp;
import o.C55338xi;
import o.DL;
import o.zP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C56133xx {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [22=4] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0142 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object AEQbTJ(@NotNull C5036Cg c5036Cg, @NotNull DT dt, @NotNull InterfaceC52805wZ interfaceC52805wZ, @NotNull BD bd, @NotNull InterfaceC55285xh interfaceC55285xh, @NotNull Function1<? super C55338xi.Activity, Unit> function1, @NotNull Continuation<? super InterfaceC5037Ch> continuation) throws java.lang.Throwable {
        PresignerKt$presignRequest$1 presignerKt$presignRequest$1;
        DT dt2;
        Function1<? super C55338xi.Activity, Unit> function12;
        C5036Cg c5036Cg2;
        InterfaceC52697wV interfaceC52697wV;
        InterfaceC55285xh interfaceC55285xh2;
        java.util.Iterator<T> it;
        java.lang.Object next;
        InterfaceC52616wS interfaceC52616wS;
        final C57631ym c57631ym;
        if (continuation instanceof PresignerKt$presignRequest$1) {
            presignerKt$presignRequest$1 = (PresignerKt$presignRequest$1) continuation;
            int i = presignerKt$presignRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                presignerKt$presignRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                presignerKt$presignRequest$1 = new PresignerKt$presignRequest$1(continuation);
            }
        }
        java.lang.Object objResolve = presignerKt$presignRequest$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = presignerKt$presignRequest$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objResolve);
            c5036Cg.EZpvd(zP.StateListAnimator.KWHzl);
            InterfaceC57843yq interfaceC57843yqAEQbTJ = dt.AEQbTJ();
            presignerKt$presignRequest$1.L$0 = c5036Cg;
            presignerKt$presignRequest$1.L$1 = dt;
            presignerKt$presignRequest$1.L$2 = bd;
            presignerKt$presignRequest$1.L$3 = interfaceC55285xh;
            presignerKt$presignRequest$1.L$4 = function1;
            presignerKt$presignRequest$1.label = 1;
            objResolve = interfaceC52805wZ.resolve(interfaceC57843yqAEQbTJ, presignerKt$presignRequest$1);
            if (objResolve == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c57631ym = (C57631ym) presignerKt$presignRequest$1.L$0;
                    C56391yDq.AEQbTJ(objResolve);
                    final InterfaceC5037Ch interfaceC5037Ch = (InterfaceC5037Ch) ((C55497xl) objResolve).AEQbTJ();
                    return C5043Cn.HttpRequest$default(interfaceC5037Ch.OLrzqt(), DL.AEQbTJ.EZpvd(new Function1<DL.Application, Unit>() { // from class: aws.smithy.kotlin.runtime.auth.awssigning.PresignerKt$presignRequest$2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DL.Application application) {
                            invoke2(application);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull DL.Application application) {
                            Intrinsics.checkNotNullParameter(application, "");
                            application.EZpvd(c57631ym.copydefault().AhwBna());
                            application.EZpvd(c57631ym.copydefault().OLrzqt());
                            application.OLrzqt(Integer.valueOf(c57631ym.copydefault().KWHzl()));
                            application.AYXKKw().AEQbTJ(interfaceC5037Ch.AEQbTJ().AEQbTJ());
                            application.EZpvd().copydefault(interfaceC5037Ch.AEQbTJ().copydefault());
                        }
                    }), interfaceC5037Ch.EZpvd(), zP.StateListAnimator.KWHzl, null, 16, null);
                }
                interfaceC52697wV = (InterfaceC52697wV) presignerKt$presignRequest$1.L$4;
                function12 = (Function1) presignerKt$presignRequest$1.L$3;
                interfaceC55285xh2 = (InterfaceC55285xh) presignerKt$presignRequest$1.L$2;
                dt2 = (DT) presignerKt$presignRequest$1.L$1;
                c5036Cg2 = (C5036Cg) presignerKt$presignRequest$1.L$0;
                C56391yDq.AEQbTJ(objResolve);
                C57631ym c57631ym2 = (C57631ym) objResolve;
                BL.AEQbTJ(c5036Cg2, dt2, c57631ym2);
                it = C57684yn.OLrzqt(c57631ym2).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (C52643wT.copydefault(((InterfaceC52616wS) next).copydefault(), C52643wT.OLrzqt.OLrzqt())) {
                        break;
                    }
                }
                interfaceC52616wS = (InterfaceC52616wS) next;
                if (interfaceC52616wS != null || (interfaceC57843yqCopydefault = interfaceC52616wS.OLrzqt()) == null) {
                    InterfaceC57843yq interfaceC57843yqCopydefault = C58108yv.copydefault();
                }
                C55338xi.StateListAnimator stateListAnimator = C55338xi.AEQbTJ;
                C55338xi.Activity activity = new C55338xi.Activity();
                C55232xg c55232xg = C55232xg.EZpvd;
                activity.AEQbTJ((java.lang.String) interfaceC57843yqCopydefault.OLrzqt(c55232xg.gEmmrt()));
                activity.EZpvd((java.lang.String) interfaceC57843yqCopydefault.OLrzqt(c55232xg.AYXKKw()));
                activity.AEQbTJ(interfaceC52697wV);
                activity.AEQbTJ(AwsSignedBodyHeader.X_AMZ_CONTENT_SHA256);
                activity.copydefault(AwsSignatureType.HTTP_REQUEST_VIA_QUERY_PARAMS);
                activity.OLrzqt(AbstractC55709xp.LoaderManager.copydefault);
                function12.invoke(activity);
                C55338xi c55338xiEZpvd = activity.EZpvd();
                InterfaceC5037Ch interfaceC5037ChCopydefault = c5036Cg2.copydefault();
                presignerKt$presignRequest$1.L$0 = c57631ym2;
                presignerKt$presignRequest$1.L$1 = null;
                presignerKt$presignRequest$1.L$2 = null;
                presignerKt$presignRequest$1.L$3 = null;
                presignerKt$presignRequest$1.L$4 = null;
                presignerKt$presignRequest$1.label = 3;
                objResolve = interfaceC55285xh2.KWHzl(interfaceC5037ChCopydefault, c55338xiEZpvd, presignerKt$presignRequest$1);
                if (objResolve != objCopydefault) {
                    return objCopydefault;
                }
                c57631ym = c57631ym2;
                final InterfaceC5037Ch interfaceC5037Ch2 = (InterfaceC5037Ch) ((C55497xl) objResolve).AEQbTJ();
                return C5043Cn.HttpRequest$default(interfaceC5037Ch2.OLrzqt(), DL.AEQbTJ.EZpvd(new Function1<DL.Application, Unit>() { // from class: aws.smithy.kotlin.runtime.auth.awssigning.PresignerKt$presignRequest$2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DL.Application application) {
                        invoke2(application);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DL.Application application) {
                        Intrinsics.checkNotNullParameter(application, "");
                        application.EZpvd(c57631ym.copydefault().AhwBna());
                        application.EZpvd(c57631ym.copydefault().OLrzqt());
                        application.OLrzqt(Integer.valueOf(c57631ym.copydefault().KWHzl()));
                        application.AYXKKw().AEQbTJ(interfaceC5037Ch2.AEQbTJ().AEQbTJ());
                        application.EZpvd().copydefault(interfaceC5037Ch2.AEQbTJ().copydefault());
                    }
                }), interfaceC5037Ch2.EZpvd(), zP.StateListAnimator.KWHzl, null, 16, null);
            }
            function1 = (Function1) presignerKt$presignRequest$1.L$4;
            interfaceC55285xh = (InterfaceC55285xh) presignerKt$presignRequest$1.L$3;
            bd = (BD) presignerKt$presignRequest$1.L$2;
            dt = (DT) presignerKt$presignRequest$1.L$1;
            c5036Cg = (C5036Cg) presignerKt$presignRequest$1.L$0;
            C56391yDq.AEQbTJ(objResolve);
        }
        InterfaceC52697wV interfaceC52697wV2 = (InterfaceC52697wV) objResolve;
        BX bx = new BX(dt, c5036Cg.copydefault(), interfaceC52697wV2);
        presignerKt$presignRequest$1.L$0 = c5036Cg;
        presignerKt$presignRequest$1.L$1 = dt;
        presignerKt$presignRequest$1.L$2 = interfaceC55285xh;
        presignerKt$presignRequest$1.L$3 = function1;
        presignerKt$presignRequest$1.L$4 = interfaceC52697wV2;
        presignerKt$presignRequest$1.label = 2;
        objResolve = bd.EZpvd(bx, presignerKt$presignRequest$1);
        if (objResolve == objCopydefault) {
            return objCopydefault;
        }
        dt2 = dt;
        function12 = function1;
        InterfaceC55285xh interfaceC55285xh3 = interfaceC55285xh;
        c5036Cg2 = c5036Cg;
        interfaceC52697wV = interfaceC52697wV2;
        interfaceC55285xh2 = interfaceC55285xh3;
        C57631ym c57631ym22 = (C57631ym) objResolve;
        BL.AEQbTJ(c5036Cg2, dt2, c57631ym22);
        it = C57684yn.OLrzqt(c57631ym22).iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        interfaceC52616wS = (InterfaceC52616wS) next;
        if (interfaceC52616wS != null) {
            InterfaceC57843yq interfaceC57843yqCopydefault2 = C58108yv.copydefault();
            C55338xi.StateListAnimator stateListAnimator2 = C55338xi.AEQbTJ;
            C55338xi.Activity activity2 = new C55338xi.Activity();
            C55232xg c55232xg2 = C55232xg.EZpvd;
            activity2.AEQbTJ((java.lang.String) interfaceC57843yqCopydefault2.OLrzqt(c55232xg2.gEmmrt()));
            activity2.EZpvd((java.lang.String) interfaceC57843yqCopydefault2.OLrzqt(c55232xg2.AYXKKw()));
            activity2.AEQbTJ(interfaceC52697wV);
            activity2.AEQbTJ(AwsSignedBodyHeader.X_AMZ_CONTENT_SHA256);
            activity2.copydefault(AwsSignatureType.HTTP_REQUEST_VIA_QUERY_PARAMS);
            activity2.OLrzqt(AbstractC55709xp.LoaderManager.copydefault);
            function12.invoke(activity2);
            C55338xi c55338xiEZpvd2 = activity2.EZpvd();
            InterfaceC5037Ch interfaceC5037ChCopydefault2 = c5036Cg2.copydefault();
            presignerKt$presignRequest$1.L$0 = c57631ym22;
            presignerKt$presignRequest$1.L$1 = null;
            presignerKt$presignRequest$1.L$2 = null;
            presignerKt$presignRequest$1.L$3 = null;
            presignerKt$presignRequest$1.L$4 = null;
            presignerKt$presignRequest$1.label = 3;
            objResolve = interfaceC55285xh2.KWHzl(interfaceC5037ChCopydefault2, c55338xiEZpvd2, presignerKt$presignRequest$1);
            if (objResolve != objCopydefault) {
            }
        }
        final InterfaceC5037Ch interfaceC5037Ch22 = (InterfaceC5037Ch) ((C55497xl) objResolve).AEQbTJ();
        return C5043Cn.HttpRequest$default(interfaceC5037Ch22.OLrzqt(), DL.AEQbTJ.EZpvd(new Function1<DL.Application, Unit>() { // from class: aws.smithy.kotlin.runtime.auth.awssigning.PresignerKt$presignRequest$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DL.Application application) {
                invoke2(application);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DL.Application application) {
                Intrinsics.checkNotNullParameter(application, "");
                application.EZpvd(c57631ym.copydefault().AhwBna());
                application.EZpvd(c57631ym.copydefault().OLrzqt());
                application.OLrzqt(Integer.valueOf(c57631ym.copydefault().KWHzl()));
                application.AYXKKw().AEQbTJ(interfaceC5037Ch22.AEQbTJ().AEQbTJ());
                application.EZpvd().copydefault(interfaceC5037Ch22.AEQbTJ().copydefault());
            }
        }), interfaceC5037Ch22.EZpvd(), zP.StateListAnimator.KWHzl, null, 16, null);
    }
}
