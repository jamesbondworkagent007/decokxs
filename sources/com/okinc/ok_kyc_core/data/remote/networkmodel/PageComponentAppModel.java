package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcelable;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel;
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
public abstract class PageComponentAppModel implements Parcelable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.rvi
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return PageComponentAppModel._init_$_anonymous_();
        }
    });

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PageComponentAppModel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ void write$Self(PageComponentAppModel pageComponentAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
    }

    public abstract String getId();

    public abstract Boolean getPageStack();

    public abstract Boolean getRequired();

    public abstract String getSubtitle();

    public abstract String getTitle();

    public abstract String getValue();

    public abstract String getVersion();

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) PageComponentAppModel.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<PageComponentAppModel> serializer() {
            return KWHzl();
        }
    }

    private PageComponentAppModel() {
    }

    public /* synthetic */ PageComponentAppModel(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new SealedClassSerializer("com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel", C56524yIo.AEQbTJ(PageComponentAppModel.class), new InterfaceC56551yJo[]{C56524yIo.AEQbTJ(FormAppModel.class), C56524yIo.AEQbTJ(PopUpAppModel.class), C56524yIo.AEQbTJ(ProcessingAppModel.class), C56524yIo.AEQbTJ(ResultAppModel.class), C56524yIo.AEQbTJ(SelectWalletVerificationAppModel.class), C56524yIo.AEQbTJ(UpdateFormAppModel.class), C56524yIo.AEQbTJ(VirtualActionAppModel.class)}, new KSerializer[]{FormAppModel$$serializer.INSTANCE, PopUpAppModel$$serializer.INSTANCE, ProcessingAppModel$$serializer.INSTANCE, ResultAppModel$$serializer.INSTANCE, SelectWalletVerificationAppModel$$serializer.INSTANCE, UpdateFormAppModel$$serializer.INSTANCE, VirtualActionAppModel$$serializer.INSTANCE}, new Annotation[0]);
    }
}
