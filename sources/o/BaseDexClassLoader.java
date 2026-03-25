package o;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.BufferType;
import o.C5098Eq;
import o.C5104Ew;
import o.EOFException;
import o.File;
import o.FileOutputStream;
import o.InterfaceC5094Em;
import o.InterfaceC5106Ey;
import o.Toast;
import o.Toolbar;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class BaseDexClassLoader {
    public static final byte[] AEQbTJ(DT dt, TextClassifier textClassifier) {
        final TextClassifier textClassifier2;
        InterfaceC5106Ey interfaceC5106EyAEQbTJ = EE.AEQbTJ();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EF("DurationSeconds"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EF("ExternalId"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EF("Policy"));
        AbstractC5105Ex.Fragment fragment = AbstractC5105Ex.Fragment.KWHzl;
        C5101Et c5101Et4 = new C5101Et(fragment, new EF("PolicyArns"));
        C5101Et c5101Et5 = new C5101Et(fragment, new EF("ProvidedContexts"));
        C5101Et c5101Et6 = new C5101Et(loaderManager, new EF("RoleArn"));
        C5101Et c5101Et7 = new C5101Et(loaderManager, new EF("RoleSessionName"));
        C5101Et c5101Et8 = new C5101Et(loaderManager, new EF("SerialNumber"));
        C5101Et c5101Et9 = new C5101Et(loaderManager, new EF("SourceIdentity"));
        C5101Et c5101Et10 = new C5101Et(fragment, new EF("Tags"));
        C5101Et c5101Et11 = new C5101Et(loaderManager, new EF("TokenCode"));
        C5101Et c5101Et12 = new C5101Et(fragment, new EF("TransitiveTagKeys"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.KWHzl(new EF("AssumeRoleRequest"));
        activity.KWHzl(new EN("Action", "AssumeRole"));
        activity.KWHzl(new EN("Version", "2011-06-15"));
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
        EB ebEZpvd = interfaceC5106EyAEQbTJ.EZpvd(activity.KWHzl());
        java.lang.Integer numCopydefault = textClassifier.copydefault();
        if (numCopydefault != null) {
            ebEZpvd.OLrzqt(c5101Et, numCopydefault.intValue());
        }
        java.lang.String strAEQbTJ = textClassifier.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strAEQbTJ);
        }
        java.lang.String strEZpvd = textClassifier.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strEZpvd);
        }
        if (textClassifier.OLrzqt() != null) {
            textClassifier2 = textClassifier;
            ebEZpvd.EZpvd(c5101Et4, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.internal.sts.serde.AssumeRoleOperationSerializerKt$serializeAssumeRoleOperationBody$1$4
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

                /* JADX INFO: renamed from: aws.sdk.kotlin.runtime.auth.credentials.internal.sts.serde.AssumeRoleOperationSerializerKt$serializeAssumeRoleOperationBody$1$4$1, reason: invalid class name */
                public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, BufferType, Unit> {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public AnonymousClass1() {
                        super(2, EOFException.class, "serializePolicyDescriptorTypeDocument", "serializePolicyDescriptorTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/PolicyDescriptorType;)V", 1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, BufferType bufferType) {
                        invoke2(interfaceC5106Ey, bufferType);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull BufferType bufferType) {
                        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
                        Intrinsics.checkNotNullParameter(bufferType, "");
                        EOFException.copydefault(interfaceC5106Ey, bufferType);
                    }
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5094Em interfaceC5094Em) {
                    Intrinsics.checkNotNullParameter(interfaceC5094Em, "");
                    Iterator<BufferType> it = textClassifier2.OLrzqt().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.EZpvd(C5104Ew.EZpvd(it.next(), AnonymousClass1.INSTANCE));
                    }
                }
            });
        } else {
            textClassifier2 = textClassifier;
        }
        if (textClassifier.KWHzl() != null) {
            ebEZpvd.EZpvd(c5101Et5, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.internal.sts.serde.AssumeRoleOperationSerializerKt$serializeAssumeRoleOperationBody$1$5
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

                /* JADX INFO: renamed from: aws.sdk.kotlin.runtime.auth.credentials.internal.sts.serde.AssumeRoleOperationSerializerKt$serializeAssumeRoleOperationBody$1$5$1, reason: invalid class name */
                public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, Toolbar, Unit> {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public AnonymousClass1() {
                        super(2, File.class, "serializeProvidedContextDocument", "serializeProvidedContextDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/ProvidedContext;)V", 1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, Toolbar toolbar) {
                        invoke2(interfaceC5106Ey, toolbar);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull Toolbar toolbar) {
                        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
                        Intrinsics.checkNotNullParameter(toolbar, "");
                        File.OLrzqt(interfaceC5106Ey, toolbar);
                    }
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5094Em interfaceC5094Em) {
                    Intrinsics.checkNotNullParameter(interfaceC5094Em, "");
                    Iterator<Toolbar> it = textClassifier2.KWHzl().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.EZpvd(C5104Ew.EZpvd(it.next(), AnonymousClass1.INSTANCE));
                    }
                }
            });
        }
        java.lang.String strDjBIcL = textClassifier.djBIcL();
        if (strDjBIcL != null) {
            ebEZpvd.AEQbTJ(c5101Et6, strDjBIcL);
        }
        java.lang.String strAYXKKw = textClassifier.AYXKKw();
        if (strAYXKKw != null) {
            ebEZpvd.AEQbTJ(c5101Et7, strAYXKKw);
        }
        java.lang.String strValueOf = textClassifier.valueOf();
        if (strValueOf != null) {
            ebEZpvd.AEQbTJ(c5101Et8, strValueOf);
        }
        java.lang.String strAhwBna = textClassifier.AhwBna();
        if (strAhwBna != null) {
            ebEZpvd.AEQbTJ(c5101Et9, strAhwBna);
        }
        if (textClassifier.gEmmrt() != null) {
            ebEZpvd.EZpvd(c5101Et10, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.internal.sts.serde.AssumeRoleOperationSerializerKt$serializeAssumeRoleOperationBody$1$10
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

                /* JADX INFO: renamed from: aws.sdk.kotlin.runtime.auth.credentials.internal.sts.serde.AssumeRoleOperationSerializerKt$serializeAssumeRoleOperationBody$1$10$1, reason: invalid class name */
                public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<InterfaceC5106Ey, Toast, Unit> {
                    public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public AnonymousClass1() {
                        super(2, FileOutputStream.class, "serializeTagDocument", "serializeTagDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/Tag;)V", 1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5106Ey interfaceC5106Ey, Toast toast) {
                        invoke2(interfaceC5106Ey, toast);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull Toast toast) {
                        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
                        Intrinsics.checkNotNullParameter(toast, "");
                        FileOutputStream.copydefault(interfaceC5106Ey, toast);
                    }
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InterfaceC5094Em interfaceC5094Em) {
                    Intrinsics.checkNotNullParameter(interfaceC5094Em, "");
                    Iterator<Toast> it = textClassifier2.gEmmrt().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.EZpvd(C5104Ew.EZpvd(it.next(), AnonymousClass1.INSTANCE));
                    }
                }
            });
        }
        java.lang.String strAkhnZx = textClassifier.AkhnZx();
        if (strAkhnZx != null) {
            ebEZpvd.AEQbTJ(c5101Et11, strAkhnZx);
        }
        if (textClassifier.isConnected() != null) {
            ebEZpvd.EZpvd(c5101Et12, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.internal.sts.serde.AssumeRoleOperationSerializerKt$serializeAssumeRoleOperationBody$1$12
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
                    Iterator<String> it = textClassifier2.isConnected().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.KWHzl(it.next());
                    }
                }
            });
        }
        ebEZpvd.AEQbTJ();
        return interfaceC5106EyAEQbTJ.copydefault();
    }
}
