package o;

import aws.sdk.kotlin.services.polly.presigners.PresignersKt$presignSynthesizeSpeech$3;
import aws.smithy.kotlin.runtime.http.HttpMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC55709xp;
import o.C5044Co;
import o.C55338xi;
import o.C56403yEb;
import o.CycleInterpolator;
import o.InterfaceC56347yC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class TranslateAnimation {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object KWHzl(@NotNull final ViewHierarchyEncoder viewHierarchyEncoder, @NotNull final PathInterpolator pathInterpolator, @NotNull InterfaceC55285xh interfaceC55285xh, @NotNull final Function1<? super C55338xi.Activity, Unit> function1, @NotNull Continuation<? super InterfaceC5037Ch> continuation) throws java.lang.Throwable {
        PresignersKt$presignSynthesizeSpeech$3 presignersKt$presignSynthesizeSpeech$3;
        InterfaceC55285xh interfaceC55285xh2;
        DT dt;
        if (continuation instanceof PresignersKt$presignSynthesizeSpeech$3) {
            presignersKt$presignSynthesizeSpeech$3 = (PresignersKt$presignSynthesizeSpeech$3) continuation;
            int i = presignersKt$presignSynthesizeSpeech$3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                presignersKt$presignSynthesizeSpeech$3.label = i - Integer.MIN_VALUE;
            } else {
                presignersKt$presignSynthesizeSpeech$3 = new PresignersKt$presignSynthesizeSpeech$3(continuation);
            }
        }
        PresignersKt$presignSynthesizeSpeech$3 presignersKt$presignSynthesizeSpeech$32 = presignersKt$presignSynthesizeSpeech$3;
        java.lang.Object objAEQbTJ = presignersKt$presignSynthesizeSpeech$32.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = presignersKt$presignSynthesizeSpeech$32.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            DT dt2 = new DT();
            dt2.OLrzqt(C57578yl.EZpvd.copydefault(), "SynthesizeSpeech");
            dt2.OLrzqt(BC.copydefault.gEmmrt(), pathInterpolator);
            ServiceWorkerController serviceWorkerController = new ServiceWorkerController();
            presignersKt$presignSynthesizeSpeech$32.L$0 = viewHierarchyEncoder;
            presignersKt$presignSynthesizeSpeech$32.L$1 = pathInterpolator;
            presignersKt$presignSynthesizeSpeech$32.L$2 = interfaceC55285xh;
            presignersKt$presignSynthesizeSpeech$32.L$3 = function1;
            presignersKt$presignSynthesizeSpeech$32.L$4 = dt2;
            presignersKt$presignSynthesizeSpeech$32.label = 1;
            java.lang.Object objKWHzl = serviceWorkerController.KWHzl(dt2, pathInterpolator, presignersKt$presignSynthesizeSpeech$32);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            interfaceC55285xh2 = interfaceC55285xh;
            dt = dt2;
            objAEQbTJ = objKWHzl;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objAEQbTJ);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            DT dt3 = (DT) presignersKt$presignSynthesizeSpeech$32.L$4;
            function1 = (Function1) presignersKt$presignSynthesizeSpeech$32.L$3;
            InterfaceC55285xh interfaceC55285xh3 = (InterfaceC55285xh) presignersKt$presignSynthesizeSpeech$32.L$2;
            pathInterpolator = (PathInterpolator) presignersKt$presignSynthesizeSpeech$32.L$1;
            ViewHierarchyEncoder viewHierarchyEncoder2 = (ViewHierarchyEncoder) presignersKt$presignSynthesizeSpeech$32.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
            interfaceC55285xh2 = interfaceC55285xh3;
            dt = dt3;
            viewHierarchyEncoder = viewHierarchyEncoder2;
        }
        C5036Cg c5036Cg = (C5036Cg) objAEQbTJ;
        WindowAnimationFrameStats windowAnimationFrameStats = new WindowAnimationFrameStats(viewHierarchyEncoder.getConfig());
        c5036Cg.KWHzl(HttpMethod.GET);
        c5036Cg.djBIcL().EZpvd().copydefault(C5167Hh.KWHzl.gEmmrt(), new Function1<InterfaceC56347yC<java.lang.String, java.lang.String>, Unit>() { // from class: aws.sdk.kotlin.services.polly.presigners.PresignersKt$presignSynthesizeSpeech$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC56347yC<String, String> interfaceC56347yC) {
                invoke2(interfaceC56347yC);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC56347yC<String, String> interfaceC56347yC) {
                Intrinsics.checkNotNullParameter(interfaceC56347yC, "");
                if (pathInterpolator.KWHzl() != null) {
                    interfaceC56347yC.AEQbTJ("Engine", pathInterpolator.KWHzl().OLrzqt());
                }
                if (pathInterpolator.AEQbTJ() != null) {
                    interfaceC56347yC.AEQbTJ("LanguageCode", pathInterpolator.AEQbTJ().KWHzl());
                }
                if (pathInterpolator.copydefault() != null && (!r0.isEmpty())) {
                    List<String> listCopydefault = pathInterpolator.copydefault();
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
                    Iterator<T> it = listCopydefault.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C5044Co.AEQbTJ((String) it.next()));
                    }
                    interfaceC56347yC.AEQbTJ("LexiconNames", arrayList);
                }
                if (pathInterpolator.OLrzqt() != null) {
                    interfaceC56347yC.AEQbTJ("OutputFormat", pathInterpolator.OLrzqt().copydefault());
                }
                String strEZpvd = pathInterpolator.EZpvd();
                if (strEZpvd != null && strEZpvd.length() > 0) {
                    interfaceC56347yC.AEQbTJ("SampleRate", pathInterpolator.EZpvd());
                }
                if (pathInterpolator.gEmmrt() != null && (!r0.isEmpty())) {
                    List<CycleInterpolator> listGEmmrt = pathInterpolator.gEmmrt();
                    ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
                    Iterator<T> it2 = listGEmmrt.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(String.valueOf((CycleInterpolator) it2.next()));
                    }
                    interfaceC56347yC.AEQbTJ("SpeechMarkTypes", arrayList2);
                }
                String strDjBIcL = pathInterpolator.djBIcL();
                if (strDjBIcL != null && strDjBIcL.length() > 0) {
                    interfaceC56347yC.AEQbTJ("Text", pathInterpolator.djBIcL());
                }
                if (pathInterpolator.valueOf() != null) {
                    interfaceC56347yC.AEQbTJ("TextType", pathInterpolator.valueOf().EZpvd());
                }
                if (pathInterpolator.AhwBna() != null) {
                    interfaceC56347yC.AEQbTJ("VoiceId", pathInterpolator.AhwBna().OLrzqt());
                }
            }
        });
        c5036Cg.AEQbTJ().EZpvd();
        InterfaceC52805wZ interfaceC52805wZEZpvd = viewHierarchyEncoder.getConfig().EZpvd();
        Function1<C55338xi.Activity, Unit> function12 = new Function1<C55338xi.Activity, Unit>() { // from class: aws.sdk.kotlin.services.polly.presigners.PresignersKt$presignSynthesizeSpeech$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.xi$Activity, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C55338xi.Activity activity) {
                invoke2(activity);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C55338xi.Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "");
                if (activity.gEmmrt() == null) {
                    activity.EZpvd("polly");
                }
                if (activity.djBIcL() == null) {
                    activity.AEQbTJ(viewHierarchyEncoder.getConfig().AkhnZx());
                }
                activity.OLrzqt(AbstractC55709xp.StateListAnimator.OLrzqt);
                function1.invoke(activity);
            }
        };
        presignersKt$presignSynthesizeSpeech$32.L$0 = null;
        presignersKt$presignSynthesizeSpeech$32.L$1 = null;
        presignersKt$presignSynthesizeSpeech$32.L$2 = null;
        presignersKt$presignSynthesizeSpeech$32.L$3 = null;
        presignersKt$presignSynthesizeSpeech$32.L$4 = null;
        presignersKt$presignSynthesizeSpeech$32.label = 2;
        objAEQbTJ = C56133xx.AEQbTJ(c5036Cg, dt, interfaceC52805wZEZpvd, windowAnimationFrameStats, interfaceC55285xh2, function12, presignersKt$presignSynthesizeSpeech$32);
        return objAEQbTJ == objCopydefault ? objCopydefault : objAEQbTJ;
    }

    public static /* synthetic */ java.lang.Object presignSynthesizeSpeech$default(ViewHierarchyEncoder viewHierarchyEncoder, PathInterpolator pathInterpolator, InterfaceC55285xh interfaceC55285xh, Function1 function1, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            interfaceC55285xh = C55815xr.copydefault();
        }
        return KWHzl(viewHierarchyEncoder, pathInterpolator, interfaceC55285xh, function1, continuation);
    }
}
