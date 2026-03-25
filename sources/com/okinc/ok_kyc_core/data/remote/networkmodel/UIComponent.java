package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcelable;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent;
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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public abstract class UIComponent implements Parcelable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.rvp
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return UIComponent._init_$_anonymous_();
        }
    });

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ UIComponent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ void write$Self(UIComponent uIComponent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
    }

    public abstract Float getBottomMargin();

    public abstract String getId();

    public abstract Float getLeftMargin();

    public abstract Boolean getRequired();

    public abstract String getValue();

    public abstract String getVersion();

    public abstract Boolean isHidden();

    public abstract void setHidden(Boolean bool);

    public abstract InterfaceC43713ruV toAppModel();

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) UIComponent.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<UIComponent> serializer() {
            return EZpvd();
        }
    }

    private UIComponent() {
    }

    public /* synthetic */ UIComponent(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new SealedClassSerializer("com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent", C56524yIo.AEQbTJ(UIComponent.class), new InterfaceC56551yJo[]{C56524yIo.AEQbTJ(Accordion.class), C56524yIo.AEQbTJ(AdBanner.class), C56524yIo.AEQbTJ(AddressCascader.class), C56524yIo.AEQbTJ(AddressSearch.class), C56524yIo.AEQbTJ(Alert.class), C56524yIo.AEQbTJ(AlertCard.class), C56524yIo.AEQbTJ(AssetList.class), C56524yIo.AEQbTJ(AutoInputChoice.class), C56524yIo.AEQbTJ(CTAButton.class), C56524yIo.AEQbTJ(Card.class), C56524yIo.AEQbTJ(Checkbox.class), C56524yIo.AEQbTJ(Columns.class), C56524yIo.AEQbTJ(CommonPopUp.class), C56524yIo.AEQbTJ(Cta.class), C56524yIo.AEQbTJ(CtaCard.class), C56524yIo.AEQbTJ(CtaList.class), C56524yIo.AEQbTJ(EditCard.class), C56524yIo.AEQbTJ(EditableList.class), C56524yIo.AEQbTJ(FileUploader.class), C56524yIo.AEQbTJ(FreeText.class), C56524yIo.AEQbTJ(Group.class), C56524yIo.AEQbTJ(HelperLabel.class), C56524yIo.AEQbTJ(HorizontalRule.class), C56524yIo.AEQbTJ(Hyperlink.class), C56524yIo.AEQbTJ(Illustration.class), C56524yIo.AEQbTJ(ImageList.class), C56524yIo.AEQbTJ(InfoFormEntry.class), C56524yIo.AEQbTJ(InputCard.class), C56524yIo.AEQbTJ(InputCardChoices.class), C56524yIo.AEQbTJ(InputCardSelect.class), C56524yIo.AEQbTJ(InputCheckboxSelect.class), C56524yIo.AEQbTJ(InputChoice.class), C56524yIo.AEQbTJ(InputChoiceWithSubInput.class), C56524yIo.AEQbTJ(InputConditionalTextOrSelect.class), C56524yIo.AEQbTJ(InputDate.class), C56524yIo.AEQbTJ(InputDateRange.class), C56524yIo.AEQbTJ(InputDescription.class), C56524yIo.AEQbTJ(InputFormatText.class), C56524yIo.AEQbTJ(InputMultipleChoices.class), C56524yIo.AEQbTJ(InputSSN.class), C56524yIo.AEQbTJ(InputSelect.class), C56524yIo.AEQbTJ(InputText.class), C56524yIo.AEQbTJ(InputVerificationCode.class), C56524yIo.AEQbTJ(ListPickerPopUp.class), C56524yIo.AEQbTJ(MergeAccountBottomPopUp.class), C56524yIo.AEQbTJ(MergeAccountCenterPopUp.class), C56524yIo.AEQbTJ(NewFileUploader.class), C56524yIo.AEQbTJ(NotificationReminder.class), C56524yIo.AEQbTJ(PairInputNumber.class), C56524yIo.AEQbTJ(ProgressStepper.class), C56524yIo.AEQbTJ(SelectCard.class), C56524yIo.AEQbTJ(SelectPopUp.class), C56524yIo.AEQbTJ(TableCard.class), C56524yIo.AEQbTJ(TextContent.class), C56524yIo.AEQbTJ(UpgradePopUp.class), C56524yIo.AEQbTJ(VerifyCenterNotification.class)}, new KSerializer[]{Accordion$$serializer.INSTANCE, AdBanner$$serializer.INSTANCE, AddressCascader$$serializer.INSTANCE, AddressSearch$$serializer.INSTANCE, Alert$$serializer.INSTANCE, AlertCard$$serializer.INSTANCE, AssetList$$serializer.INSTANCE, AutoInputChoice$$serializer.INSTANCE, CTAButton$$serializer.INSTANCE, Card$$serializer.INSTANCE, Checkbox$$serializer.INSTANCE, Columns$$serializer.INSTANCE, CommonPopUp$$serializer.INSTANCE, Cta$$serializer.INSTANCE, CtaCard$$serializer.INSTANCE, CtaList$$serializer.INSTANCE, EditCard$$serializer.INSTANCE, EditableList$$serializer.INSTANCE, FileUploader$$serializer.INSTANCE, FreeText$$serializer.INSTANCE, Group$$serializer.INSTANCE, HelperLabel$$serializer.INSTANCE, HorizontalRule$$serializer.INSTANCE, Hyperlink$$serializer.INSTANCE, Illustration$$serializer.INSTANCE, ImageList$$serializer.INSTANCE, InfoFormEntry$$serializer.INSTANCE, InputCard$$serializer.INSTANCE, InputCardChoices$$serializer.INSTANCE, InputCardSelect$$serializer.INSTANCE, InputCheckboxSelect$$serializer.INSTANCE, InputChoice$$serializer.INSTANCE, InputChoiceWithSubInput$$serializer.INSTANCE, InputConditionalTextOrSelect$$serializer.INSTANCE, InputDate$$serializer.INSTANCE, InputDateRange$$serializer.INSTANCE, InputDescription$$serializer.INSTANCE, InputFormatText$$serializer.INSTANCE, InputMultipleChoices$$serializer.INSTANCE, InputSSN$$serializer.INSTANCE, InputSelect$$serializer.INSTANCE, InputText$$serializer.INSTANCE, InputVerificationCode$$serializer.INSTANCE, ListPickerPopUp$$serializer.INSTANCE, MergeAccountBottomPopUp$$serializer.INSTANCE, MergeAccountCenterPopUp$$serializer.INSTANCE, NewFileUploader$$serializer.INSTANCE, NotificationReminder$$serializer.INSTANCE, PairInputNumber$$serializer.INSTANCE, ProgressStepper$$serializer.INSTANCE, SelectCard$$serializer.INSTANCE, SelectPopUp$$serializer.INSTANCE, TableCard$$serializer.INSTANCE, TextContent$$serializer.INSTANCE, UpgradePopUp$$serializer.INSTANCE, VerifyCenterNotification$$serializer.INSTANCE}, new Annotation[0]);
    }
}
