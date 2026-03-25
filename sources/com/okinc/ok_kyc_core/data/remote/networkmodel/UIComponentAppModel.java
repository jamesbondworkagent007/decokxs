package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcelable;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public abstract class UIComponentAppModel implements Parcelable, InterfaceC43713ruV {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.rvw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return UIComponentAppModel._init_$_anonymous_();
        }
    });

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ UIComponentAppModel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ void write$Self(UIComponentAppModel uIComponentAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
    }

    public abstract UIComponentAppModel clone();

    public abstract Float getBottomMargin();

    public abstract String getId();

    public abstract Float getLeftMargin();

    public abstract Boolean getRequired();

    public abstract String getValue();

    public abstract String getVersion();

    public abstract Boolean isHidden();

    public abstract void setBottomMargin(Float f);

    public abstract void setHidden(Boolean bool);

    public abstract void setId(@NotNull String str);

    public abstract void setValue(String str);

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) UIComponentAppModel.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<UIComponentAppModel> serializer() {
            return copydefault();
        }
    }

    private UIComponentAppModel() {
    }

    public /* synthetic */ UIComponentAppModel(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new SealedClassSerializer("com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel", C56524yIo.AEQbTJ(UIComponentAppModel.class), new InterfaceC56551yJo[]{C56524yIo.AEQbTJ(AccordionAppModel.class), C56524yIo.AEQbTJ(AdBannerAppModel.class), C56524yIo.AEQbTJ(AddressCascaderAppModel.class), C56524yIo.AEQbTJ(AddressSearchAppModel.class), C56524yIo.AEQbTJ(AlertAppModel.class), C56524yIo.AEQbTJ(AlertCardAppModel.class), C56524yIo.AEQbTJ(AssetListAppModel.class), C56524yIo.AEQbTJ(AutoInputChoiceAppModel.class), C56524yIo.AEQbTJ(CTAButtonAppModel.class), C56524yIo.AEQbTJ(CardAppModel.class), C56524yIo.AEQbTJ(CheckboxAppModel.class), C56524yIo.AEQbTJ(ColumnsAppModel.class), C56524yIo.AEQbTJ(CtaAppModel.class), C56524yIo.AEQbTJ(CtaCardAppModel.class), C56524yIo.AEQbTJ(CtaListAppModel.class), C56524yIo.AEQbTJ(EditCardAppModel.class), C56524yIo.AEQbTJ(EditableListAppModel.class), C56524yIo.AEQbTJ(FileUploaderAppModel.class), C56524yIo.AEQbTJ(FreeTextAppModel.class), C56524yIo.AEQbTJ(HelperLabelAppModel.class), C56524yIo.AEQbTJ(HorizontalRuleAppModel.class), C56524yIo.AEQbTJ(HyperlinkAppModel.class), C56524yIo.AEQbTJ(IllustrationAppModel.class), C56524yIo.AEQbTJ(ImageListAppModel.class), C56524yIo.AEQbTJ(InfoFormEntryAppModel.class), C56524yIo.AEQbTJ(InputCardAppModel.class), C56524yIo.AEQbTJ(InputCardChoicesAppModel.class), C56524yIo.AEQbTJ(InputCardSelectAppModel.class), C56524yIo.AEQbTJ(InputCheckboxSelectAppModel.class), C56524yIo.AEQbTJ(InputChoiceAppModel.class), C56524yIo.AEQbTJ(InputChoiceWithSubInputAppModel.class), C56524yIo.AEQbTJ(InputConditionalTextOrSelectAppModel.class), C56524yIo.AEQbTJ(InputDateAppModel.class), C56524yIo.AEQbTJ(InputDateRangeAppModel.class), C56524yIo.AEQbTJ(InputDescriptionAppModel.class), C56524yIo.AEQbTJ(InputFormatTextAppModel.class), C56524yIo.AEQbTJ(InputMultipleChoicesAppModel.class), C56524yIo.AEQbTJ(InputSSNAppModel.class), C56524yIo.AEQbTJ(InputSelectAppModel.class), C56524yIo.AEQbTJ(InputTextAppModel.class), C56524yIo.AEQbTJ(InputVerificationCodeAppModel.class), C56524yIo.AEQbTJ(NewFileUploaderAppModel.class), C56524yIo.AEQbTJ(NotificationReminderAppModel.class), C56524yIo.AEQbTJ(PairInputNumberAppModel.class), C56524yIo.AEQbTJ(ProgressStepperAppModel.class), C56524yIo.AEQbTJ(SelectCardAppModel.class), C56524yIo.AEQbTJ(TableCardAppModel.class), C56524yIo.AEQbTJ(TextContentAppModel.class), C56524yIo.AEQbTJ(VerifyCenterNotificationAppModel.class)}, new KSerializer[]{AccordionAppModel$$serializer.INSTANCE, AdBannerAppModel$$serializer.INSTANCE, AddressCascaderAppModel$$serializer.INSTANCE, AddressSearchAppModel$$serializer.INSTANCE, AlertAppModel$$serializer.INSTANCE, AlertCardAppModel$$serializer.INSTANCE, AssetListAppModel$$serializer.INSTANCE, AutoInputChoiceAppModel$$serializer.INSTANCE, CTAButtonAppModel$$serializer.INSTANCE, CardAppModel$$serializer.INSTANCE, CheckboxAppModel$$serializer.INSTANCE, ColumnsAppModel$$serializer.INSTANCE, CtaAppModel$$serializer.INSTANCE, CtaCardAppModel$$serializer.INSTANCE, CtaListAppModel$$serializer.INSTANCE, EditCardAppModel$$serializer.INSTANCE, EditableListAppModel$$serializer.INSTANCE, FileUploaderAppModel$$serializer.INSTANCE, FreeTextAppModel$$serializer.INSTANCE, HelperLabelAppModel$$serializer.INSTANCE, HorizontalRuleAppModel$$serializer.INSTANCE, HyperlinkAppModel$$serializer.INSTANCE, IllustrationAppModel$$serializer.INSTANCE, ImageListAppModel$$serializer.INSTANCE, InfoFormEntryAppModel$$serializer.INSTANCE, InputCardAppModel$$serializer.INSTANCE, InputCardChoicesAppModel$$serializer.INSTANCE, InputCardSelectAppModel$$serializer.INSTANCE, InputCheckboxSelectAppModel$$serializer.INSTANCE, InputChoiceAppModel$$serializer.INSTANCE, InputChoiceWithSubInputAppModel$$serializer.INSTANCE, InputConditionalTextOrSelectAppModel$$serializer.INSTANCE, InputDateAppModel$$serializer.INSTANCE, InputDateRangeAppModel$$serializer.INSTANCE, InputDescriptionAppModel$$serializer.INSTANCE, InputFormatTextAppModel$$serializer.INSTANCE, InputMultipleChoicesAppModel$$serializer.INSTANCE, InputSSNAppModel$$serializer.INSTANCE, InputSelectAppModel$$serializer.INSTANCE, InputTextAppModel$$serializer.INSTANCE, InputVerificationCodeAppModel$$serializer.INSTANCE, NewFileUploaderAppModel$$serializer.INSTANCE, NotificationReminderAppModel$$serializer.INSTANCE, PairInputNumberAppModel$$serializer.INSTANCE, ProgressStepperAppModel$$serializer.INSTANCE, SelectCardAppModel$$serializer.INSTANCE, TableCardAppModel$$serializer.INSTANCE, TextContentAppModel$$serializer.INSTANCE, VerifyCenterNotificationAppModel$$serializer.INSTANCE}, new Annotation[0]);
    }
}
