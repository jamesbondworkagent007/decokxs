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
public final class Plugin {
    public static final byte[] KWHzl(DT dt, ClipRectAnimation clipRectAnimation) {
        final ClipRectAnimation clipRectAnimation2;
        EW ew = new EW();
        AbstractC5105Ex.StateListAnimator stateListAnimator = AbstractC5105Ex.StateListAnimator.copydefault;
        C5101Et c5101Et = new C5101Et(stateListAnimator, new EX("Engine"));
        C5101Et c5101Et2 = new C5101Et(stateListAnimator, new EX("LanguageCode"));
        AbstractC5105Ex.Fragment fragment = AbstractC5105Ex.Fragment.KWHzl;
        C5101Et c5101Et3 = new C5101Et(fragment, new EX("LexiconNames"));
        C5101Et c5101Et4 = new C5101Et(stateListAnimator, new EX("OutputFormat"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("OutputS3BucketName"));
        C5101Et c5101Et6 = new C5101Et(loaderManager, new EX("OutputS3KeyPrefix"));
        C5101Et c5101Et7 = new C5101Et(loaderManager, new EX("SampleRate"));
        C5101Et c5101Et8 = new C5101Et(loaderManager, new EX("SnsTopicArn"));
        C5101Et c5101Et9 = new C5101Et(fragment, new EX("SpeechMarkTypes"));
        C5101Et c5101Et10 = new C5101Et(loaderManager, new EX("Text"));
        C5101Et c5101Et11 = new C5101Et(stateListAnimator, new EX("TextType"));
        C5101Et c5101Et12 = new C5101Et(stateListAnimator, new EX("VoiceId"));
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
        activity.EZpvd(c5101Et10);
        activity.EZpvd(c5101Et11);
        activity.EZpvd(c5101Et12);
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        AccessibilityCache accessibilityCacheCopydefault = clipRectAnimation.copydefault();
        if (accessibilityCacheCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et, accessibilityCacheCopydefault.OLrzqt());
        }
        AccelerateInterpolator accelerateInterpolatorEZpvd = clipRectAnimation.EZpvd();
        if (accelerateInterpolatorEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et2, accelerateInterpolatorEZpvd.KWHzl());
        }
        if (clipRectAnimation.AEQbTJ() != null) {
            clipRectAnimation2 = clipRectAnimation;
            ebEZpvd.EZpvd(c5101Et3, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.polly.serde.StartSpeechSynthesisTaskOperationSerializerKt$serializeStartSpeechSynthesisTaskOperationBody$1$3
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
                    Iterator<String> it = clipRectAnimation2.AEQbTJ().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next());
                    }
                }
            });
        } else {
            clipRectAnimation2 = clipRectAnimation;
        }
        DecelerateInterpolator decelerateInterpolatorKWHzl = clipRectAnimation.KWHzl();
        if (decelerateInterpolatorKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et4, decelerateInterpolatorKWHzl.copydefault());
        }
        java.lang.String strOLrzqt = clipRectAnimation.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et5, strOLrzqt);
        }
        java.lang.String strDjBIcL = clipRectAnimation.djBIcL();
        if (strDjBIcL != null) {
            ebEZpvd.AEQbTJ(c5101Et6, strDjBIcL);
        }
        java.lang.String strValueOf = clipRectAnimation.valueOf();
        if (strValueOf != null) {
            ebEZpvd.AEQbTJ(c5101Et7, strValueOf);
        }
        java.lang.String strAhwBna = clipRectAnimation.AhwBna();
        if (strAhwBna != null) {
            ebEZpvd.AEQbTJ(c5101Et8, strAhwBna);
        }
        if (clipRectAnimation.gEmmrt() != null) {
            ebEZpvd.EZpvd(c5101Et9, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.polly.serde.StartSpeechSynthesisTaskOperationSerializerKt$serializeStartSpeechSynthesisTaskOperationBody$1$9
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
                    Iterator<CycleInterpolator> it = clipRectAnimation2.gEmmrt().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next().OLrzqt());
                    }
                }
            });
        }
        java.lang.String strAYXKKw = clipRectAnimation.AYXKKw();
        if (strAYXKKw != null) {
            ebEZpvd.AEQbTJ(c5101Et10, strAYXKKw);
        }
        AutofillManager autofillManagerValues = clipRectAnimation.values();
        if (autofillManagerValues != null) {
            ebEZpvd.AEQbTJ(c5101Et11, autofillManagerValues.EZpvd());
        }
        TranslateYAnimation translateYAnimationFetchVPNInfo = clipRectAnimation.fetchVPNInfo();
        if (translateYAnimationFetchVPNInfo != null) {
            ebEZpvd.AEQbTJ(c5101Et12, translateYAnimationFetchVPNInfo.OLrzqt());
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
