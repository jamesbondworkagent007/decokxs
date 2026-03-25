package o;

import aws.sdk.kotlin.services.translate.serde.StartTextTranslationJobOperationSerializerKt$serializeStartTextTranslationJobOperationBody$1$3$1;
import aws.sdk.kotlin.services.translate.serde.StartTextTranslationJobOperationSerializerKt$serializeStartTextTranslationJobOperationBody$1$5$1;
import aws.sdk.kotlin.services.translate.serde.StartTextTranslationJobOperationSerializerKt$serializeStartTextTranslationJobOperationBody$1$7$1;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5094Em;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C50508vR {
    public static final byte[] AEQbTJ(DT dt, final C46294tP c46294tP) {
        Unit unit;
        EW ew = new EW();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("ClientToken"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("DataAccessRoleArn"));
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et3 = new C5101Et(pictureInPictureParams, new EX("InputDataConfig"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("JobName"));
        C5101Et c5101Et5 = new C5101Et(pictureInPictureParams, new EX("OutputDataConfig"));
        AbstractC5105Ex.Fragment fragment = AbstractC5105Ex.Fragment.KWHzl;
        C5101Et c5101Et6 = new C5101Et(fragment, new EX("ParallelDataNames"));
        C5101Et c5101Et7 = new C5101Et(pictureInPictureParams, new EX("Settings"));
        C5101Et c5101Et8 = new C5101Et(loaderManager, new EX("SourceLanguageCode"));
        C5101Et c5101Et9 = new C5101Et(fragment, new EX("TargetLanguageCodes"));
        C5101Et c5101Et10 = new C5101Et(fragment, new EX("TerminologyNames"));
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
        EB ebEZpvd = ew.EZpvd(activity.KWHzl());
        java.lang.String strOLrzqt = c46294tP.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et, strOLrzqt);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            ebEZpvd.AEQbTJ(c5101Et, C57419yi.EZpvd(dt).KWHzl());
        }
        java.lang.String strEZpvd = c46294tP.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strEZpvd);
        }
        C47280tn c47280tnAEQbTJ = c46294tP.AEQbTJ();
        if (c47280tnAEQbTJ != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et3, c47280tnAEQbTJ, StartTextTranslationJobOperationSerializerKt$serializeStartTextTranslationJobOperationBody$1$3$1.INSTANCE);
        }
        java.lang.String strKWHzl = c46294tP.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strKWHzl);
        }
        C45916tB c45916tBCopydefault = c46294tP.copydefault();
        if (c45916tBCopydefault != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et5, c45916tBCopydefault, StartTextTranslationJobOperationSerializerKt$serializeStartTextTranslationJobOperationBody$1$5$1.INSTANCE);
        }
        if (c46294tP.djBIcL() != null) {
            ebEZpvd.EZpvd(c5101Et6, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.translate.serde.StartTextTranslationJobOperationSerializerKt$serializeStartTextTranslationJobOperationBody$1$6
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
                    Iterator<String> it = c46294tP.djBIcL().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next());
                    }
                }
            });
        }
        C48882ue c48882ueGEmmrt = c46294tP.gEmmrt();
        if (c48882ueGEmmrt != null) {
            C5104Ew.EZpvd(ebEZpvd, c5101Et7, c48882ueGEmmrt, StartTextTranslationJobOperationSerializerKt$serializeStartTextTranslationJobOperationBody$1$7$1.INSTANCE);
        }
        java.lang.String strAhwBna = c46294tP.AhwBna();
        if (strAhwBna != null) {
            ebEZpvd.AEQbTJ(c5101Et8, strAhwBna);
        }
        if (c46294tP.AYXKKw() != null) {
            ebEZpvd.EZpvd(c5101Et9, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.translate.serde.StartTextTranslationJobOperationSerializerKt$serializeStartTextTranslationJobOperationBody$1$9
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
                    Iterator<String> it = c46294tP.AYXKKw().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next());
                    }
                }
            });
        }
        if (c46294tP.valueOf() != null) {
            ebEZpvd.EZpvd(c5101Et10, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.services.translate.serde.StartTextTranslationJobOperationSerializerKt$serializeStartTextTranslationJobOperationBody$1$10
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
                    Iterator<String> it = c46294tP.valueOf().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next());
                    }
                }
            });
        }
        ebEZpvd.AEQbTJ();
        return ew.copydefault();
    }
}
