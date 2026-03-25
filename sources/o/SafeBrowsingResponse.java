package o;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.CycleInterpolator;
import o.InterfaceC5094Em;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class SafeBrowsingResponse {
    public static final byte[] KWHzl(DT dt, final PathInterpolator pathInterpolator) {
        EW ew = new EW();
        AbstractC5105Ex.StateListAnimator stateListAnimator = AbstractC5105Ex.StateListAnimator.copydefault;
        C5101Et c5101Et = new C5101Et(stateListAnimator, new EX("Engine"));
        C5101Et c5101Et2 = new C5101Et(stateListAnimator, new EX("LanguageCode"));
        AbstractC5105Ex.Fragment fragment = AbstractC5105Ex.Fragment.KWHzl;
        C5101Et c5101Et3 = new C5101Et(fragment, new EX("LexiconNames"));
        C5101Et c5101Et4 = new C5101Et(stateListAnimator, new EX("OutputFormat"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("SampleRate"));
        C5101Et c5101Et6 = new C5101Et(fragment, new EX("SpeechMarkTypes"));
        C5101Et c5101Et7 = new C5101Et(loaderManager, new EX("Text"));
        C5101Et c5101Et8 = new C5101Et(stateListAnimator, new EX("TextType"));
        C5101Et c5101Et9 = new C5101Et(stateListAnimator, new EX("VoiceId"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        activity.EZpvd(c5101Et7);
        activity.EZpvd(c5101Et8);
        activity.EZpvd(c5101Et9);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        AccessibilityCache accessibilityCacheKWHzl = pathInterpolator.KWHzl();
        if (accessibilityCacheKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et, accessibilityCacheKWHzl.OLrzqt());
        }
        AccelerateInterpolator accelerateInterpolatorAEQbTJ = pathInterpolator.AEQbTJ();
        if (accelerateInterpolatorAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et2, accelerateInterpolatorAEQbTJ.KWHzl());
        }
        if (pathInterpolator.copydefault() != null) {
            ebEZpvd.EZpvd(c5101Et3, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.polly.serde.SynthesizeSpeechOperationSerializerKt$serializeSynthesizeSpeechOperationBody$1$3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5094Em interfaceC5094Em) {
                    invoke2(interfaceC5094Em);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5094Em interfaceC5094Em) {
                    Intrinsics.checkNotNullParameter(interfaceC5094Em, "");
                    Iterator<String> it = pathInterpolator.copydefault().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next());
                    }
                }
            });
        }
        DecelerateInterpolator decelerateInterpolatorOLrzqt = pathInterpolator.OLrzqt();
        if (decelerateInterpolatorOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et4, decelerateInterpolatorOLrzqt.copydefault());
        }
        java.lang.String strEZpvd = pathInterpolator.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et5, strEZpvd);
        }
        if (pathInterpolator.gEmmrt() != null) {
            ebEZpvd.EZpvd(c5101Et6, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.polly.serde.SynthesizeSpeechOperationSerializerKt$serializeSynthesizeSpeechOperationBody$1$6
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5094Em interfaceC5094Em) {
                    invoke2(interfaceC5094Em);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5094Em interfaceC5094Em) {
                    Intrinsics.checkNotNullParameter(interfaceC5094Em, "");
                    Iterator<CycleInterpolator> it = pathInterpolator.gEmmrt().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next().OLrzqt());
                    }
                }
            });
        }
        java.lang.String strDjBIcL = pathInterpolator.djBIcL();
        if (strDjBIcL != null) {
            ebEZpvd.AEQbTJ(c5101Et7, strDjBIcL);
        }
        AutofillManager autofillManagerValueOf = pathInterpolator.valueOf();
        if (autofillManagerValueOf != null) {
            ebEZpvd.AEQbTJ(c5101Et8, autofillManagerValueOf.EZpvd());
        }
        TranslateYAnimation translateYAnimationAhwBna = pathInterpolator.AhwBna();
        if (translateYAnimationAhwBna != null) {
            ebEZpvd.AEQbTJ(c5101Et9, translateYAnimationAhwBna.OLrzqt());
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
