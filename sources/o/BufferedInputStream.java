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
import o.InterfaceC5094Em;
import o.InterfaceC5106Ey;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class BufferedInputStream {
    public static final byte[] OLrzqt(DT dt, final InputConnection inputConnection) {
        InterfaceC5106Ey interfaceC5106EyAEQbTJ = EE.AEQbTJ();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EF("DurationSeconds"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EF("Policy"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EF("PolicyArns"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EF("ProviderId"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EF("RoleArn"));
        C5101Et c5101Et6 = new C5101Et(loaderManager, new EF("RoleSessionName"));
        C5101Et c5101Et7 = new C5101Et(loaderManager, new EF("WebIdentityToken"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.KWHzl(new EF("AssumeRoleWithWebIdentityRequest"));
        activity.KWHzl(new EN("Action", "AssumeRoleWithWebIdentity"));
        activity.KWHzl(new EN("Version", "2011-06-15"));
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        activity.EZpvd(c5101Et7);
        EB ebEZpvd = interfaceC5106EyAEQbTJ.EZpvd(activity.KWHzl());
        java.lang.Integer numAEQbTJ = inputConnection.AEQbTJ();
        if (numAEQbTJ != null) {
            ebEZpvd.OLrzqt(c5101Et, numAEQbTJ.intValue());
        }
        java.lang.String strEZpvd = inputConnection.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strEZpvd);
        }
        if (inputConnection.OLrzqt() != null) {
            ebEZpvd.EZpvd(c5101Et3, new Function1<InterfaceC5094Em, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.internal.sts.serde.AssumeRoleWithWebIdentityOperationSerializerKt$serializeAssumeRoleWithWebIdentityOperationBody$1$3
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

                /* JADX INFO: renamed from: aws.sdk.kotlin.runtime.auth.credentials.internal.sts.serde.AssumeRoleWithWebIdentityOperationSerializerKt$serializeAssumeRoleWithWebIdentityOperationBody$1$3$1, reason: invalid class name */
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
                    Iterator<BufferType> it = inputConnection.OLrzqt().iterator();
                    while (it.hasNext()) {
                        interfaceC5094Em.EZpvd(C5104Ew.EZpvd(it.next(), AnonymousClass1.INSTANCE));
                    }
                }
            });
        }
        java.lang.String strKWHzl = inputConnection.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strKWHzl);
        }
        java.lang.String strCopydefault = inputConnection.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et5, strCopydefault);
        }
        java.lang.String strAYXKKw = inputConnection.AYXKKw();
        if (strAYXKKw != null) {
            ebEZpvd.AEQbTJ(c5101Et6, strAYXKKw);
        }
        java.lang.String strValueOf = inputConnection.valueOf();
        if (strValueOf != null) {
            ebEZpvd.AEQbTJ(c5101Et7, strValueOf);
        }
        ebEZpvd.AEQbTJ();
        return interfaceC5106EyAEQbTJ.copydefault();
    }
}
