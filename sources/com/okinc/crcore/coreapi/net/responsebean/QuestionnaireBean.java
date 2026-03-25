package com.okinc.crcore.coreapi.net.responsebean;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class QuestionnaireBean {
    private final ArrayList<AnswersBean> answers;
    private final QuestionBean question;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(AnswersBean$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QuestionnaireBean() {
        this((QuestionBean) null, (ArrayList) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.coreapi.net.responsebean.QuestionnaireBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuestionnaireBean copy$default(QuestionnaireBean questionnaireBean, QuestionBean questionBean, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            questionBean = questionnaireBean.question;
        }
        if ((i & 2) != 0) {
            arrayList = questionnaireBean.answers;
        }
        return questionnaireBean.copy(questionBean, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuestionBean component1() {
        return this.question;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AnswersBean> component2() {
        return this.answers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuestionnaireBean copy(@NotNull QuestionBean questionBean, @NotNull ArrayList<AnswersBean> arrayList) {
        Intrinsics.checkNotNullParameter(questionBean, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new QuestionnaireBean(questionBean, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionnaireBean)) {
            return false;
        }
        QuestionnaireBean questionnaireBean = (QuestionnaireBean) obj;
        return Intrinsics.EZpvd(this.question, questionnaireBean.question) && Intrinsics.EZpvd(this.answers, questionnaireBean.answers);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AnswersBean> getAnswers() {
        return this.answers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuestionBean getQuestion() {
        return this.question;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.question.hashCode() * 31) + this.answers.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QuestionnaireBean(question=" + this.question + ", answers=" + this.answers + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.QuestionnaireBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<QuestionnaireBean> serializer() {
            return QuestionnaireBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ QuestionnaireBean(int i, QuestionBean questionBean, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        this.question = (i & 1) == 0 ? new QuestionBean((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : questionBean;
        if ((i & 2) == 0) {
            this.answers = new ArrayList<>();
        } else {
            this.answers = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(QuestionnaireBean questionnaireBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(questionnaireBean.question, new QuestionBean((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, QuestionBean$$serializer.INSTANCE, questionnaireBean.question);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(questionnaireBean.answers, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], questionnaireBean.answers);
    }

    public QuestionnaireBean(@NotNull QuestionBean questionBean, @NotNull ArrayList<AnswersBean> arrayList) {
        Intrinsics.checkNotNullParameter(questionBean, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.question = questionBean;
        this.answers = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (wrap:com.okinc.crcore.coreapi.net.responsebean.QuestionBean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.crcore.coreapi.net.responsebean.QuestionBean:0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:11) call: com.okinc.crcore.coreapi.net.responsebean.QuestionBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r8v0 com.okinc.crcore.coreapi.net.responsebean.QuestionBean))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0011: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0017: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:12) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r9v0 java.util.ArrayList))
 A[MD:(com.okinc.crcore.coreapi.net.responsebean.QuestionBean, java.util.ArrayList<com.okinc.crcore.coreapi.net.responsebean.AnswersBean>):void (m)] (LINE:10) call: com.okinc.crcore.coreapi.net.responsebean.QuestionnaireBean.<init>(com.okinc.crcore.coreapi.net.responsebean.QuestionBean, java.util.ArrayList):void type: THIS */
    public /* synthetic */ QuestionnaireBean(QuestionBean questionBean, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new QuestionBean((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : questionBean, (i & 2) != 0 ? new ArrayList() : arrayList);
    }
}
