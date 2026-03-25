package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcelable;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.InterfaceC56551yJo;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public abstract class PageComponent implements Parcelable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.rvh
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return PageComponent._init_$_anonymous_();
        }
    });

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PageComponent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ void write$Self(PageComponent pageComponent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
    }

    public abstract String getId();

    public abstract Boolean getPageStack();

    public abstract Boolean getRequired();

    public abstract String getSubtitle();

    public abstract String getTitle();

    public abstract String getValue();

    public abstract String getVersion();

    public abstract PageComponentAppModel toAppModel();

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) PageComponent.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<PageComponent> serializer() {
            return KWHzl();
        }
    }

    private PageComponent() {
    }

    public /* synthetic */ PageComponent(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new SealedClassSerializer("com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponent", C56524yIo.AEQbTJ(PageComponent.class), new InterfaceC56551yJo[]{C56524yIo.AEQbTJ(Form.class), C56524yIo.AEQbTJ(Info.class), C56524yIo.AEQbTJ(PopUp.class), C56524yIo.AEQbTJ(Processing.class), C56524yIo.AEQbTJ(Result.class), C56524yIo.AEQbTJ(SelectWalletVerification.class), C56524yIo.AEQbTJ(UpdateForm.class), C56524yIo.AEQbTJ(VerificationCenter.class), C56524yIo.AEQbTJ(VirtualAction.class)}, new KSerializer[]{Form$$serializer.INSTANCE, Info$$serializer.INSTANCE, PopUp$$serializer.INSTANCE, Processing$$serializer.INSTANCE, Result$$serializer.INSTANCE, SelectWalletVerification$$serializer.INSTANCE, UpdateForm$$serializer.INSTANCE, VerificationCenter$$serializer.INSTANCE, VirtualAction$$serializer.INSTANCE}, new Annotation[0]);
    }
}
