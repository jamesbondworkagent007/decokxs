package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcelable;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel;
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
import o.InterfaceC43713ruV;
import o.InterfaceC56387yDm;
import o.InterfaceC56551yJo;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public abstract class PopUpComponentAppModel implements Parcelable, InterfaceC43713ruV {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.rvl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return PopUpComponentAppModel._init_$_anonymous_();
        }
    });

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PopUpComponentAppModel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ void write$Self(PopUpComponentAppModel popUpComponentAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
    }

    public abstract String getId();

    public abstract Boolean getRequired();

    public abstract String getValue();

    public abstract String getVersion();

    public abstract void setValue(String str);

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) PopUpComponentAppModel.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<PopUpComponentAppModel> serializer() {
            return AEQbTJ();
        }
    }

    private PopUpComponentAppModel() {
    }

    public /* synthetic */ PopUpComponentAppModel(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new SealedClassSerializer("com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel", C56524yIo.AEQbTJ(PopUpComponentAppModel.class), new InterfaceC56551yJo[]{C56524yIo.AEQbTJ(CommonPopUpAppModel.class), C56524yIo.AEQbTJ(ListPickerPopUpAppModel.class), C56524yIo.AEQbTJ(MergeAccountBottomPopUpAppModel.class), C56524yIo.AEQbTJ(MergeAccountCenterPopUpAppModel.class), C56524yIo.AEQbTJ(SelectPopUpAppModel.class), C56524yIo.AEQbTJ(UpgradePopUpAppModel.class)}, new KSerializer[]{CommonPopUpAppModel$$serializer.INSTANCE, ListPickerPopUpAppModel$$serializer.INSTANCE, MergeAccountBottomPopUpAppModel$$serializer.INSTANCE, MergeAccountCenterPopUpAppModel$$serializer.INSTANCE, SelectPopUpAppModel$$serializer.INSTANCE, UpgradePopUpAppModel$$serializer.INSTANCE}, new Annotation[0]);
    }
}
