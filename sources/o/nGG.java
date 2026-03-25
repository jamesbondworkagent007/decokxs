package o;

import androidx.core.content.ContextCompat;
import androidx.databinding.ViewDataBinding;
import com.okinc.im.imui.conversationlist.model.GroupConversation$buildConversationContent$1;
import com.okinc.im.imui.conversationlist.model.GroupConversation$updateSummary$1;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKUserInfo;
import com.okinc.okimcore.model.other.OKRecallNotificationMessage;
import com.okinc.okimcore.model.room.inhouseim.DraftMessageModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class nGG extends nGE {
    public final java.lang.String AYXKKw;
    public android.text.SpannableString valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nGG(@NotNull android.content.Context context, @NotNull OKConversation oKConversation) {
        super(context, oKConversation);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKConversation, "");
        this.AYXKKw = nGG.class.getSimpleName();
        copydefault(oKConversation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.nGE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        GroupConversation$buildConversationContent$1 groupConversation$buildConversationContent$1;
        android.text.SpannableStringBuilder spannableStringBuilder;
        nGG ngg;
        android.text.SpannableStringBuilder spannableStringBuilder2;
        if (continuation instanceof GroupConversation$buildConversationContent$1) {
            groupConversation$buildConversationContent$1 = (GroupConversation$buildConversationContent$1) continuation;
            int i = groupConversation$buildConversationContent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupConversation$buildConversationContent$1.label = i - Integer.MIN_VALUE;
            } else {
                groupConversation$buildConversationContent$1 = new GroupConversation$buildConversationContent$1(this, continuation);
            }
        }
        java.lang.Object obj = groupConversation$buildConversationContent$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = groupConversation$buildConversationContent$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            spannableStringBuilder = new android.text.SpannableStringBuilder();
            OKMessageContent latestMessage = AEQbTJ().getLatestMessage();
            boolean z = AEQbTJ().getUnreadMentionedCount() > 0;
            java.lang.Integer mentionedType = AEQbTJ().getMentionedType();
            if (z) {
                java.lang.String strAYXKKw = (mentionedType != null && mentionedType.intValue() == 1) ? C33070mpX.AYXKKw(C35399nuc.LoaderManager.FHvxmb) : C33070mpX.AYXKKw(C35399nuc.LoaderManager.RlQdEF);
                android.text.SpannableString spannableString = new android.text.SpannableString(strAYXKKw);
                this.valueOf = spannableString;
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(copydefault(), C32113mPz.ActionBar.zsXlph)), 0, strAYXKKw.length(), 33);
                spannableStringBuilder.append((java.lang.CharSequence) this.valueOf).append((java.lang.CharSequence) " ");
                groupConversation$buildConversationContent$1.L$0 = this;
                groupConversation$buildConversationContent$1.L$1 = spannableStringBuilder;
                groupConversation$buildConversationContent$1.label = 1;
                if (EZpvd(latestMessage, spannableStringBuilder, groupConversation$buildConversationContent$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                DraftMessageModel draftMessageModel = AEQbTJ().getDraftMessageModel();
                if (!android.text.TextUtils.isEmpty(draftMessageModel != null ? draftMessageModel.getMessage() : null)) {
                    java.lang.String str = copydefault().getString(C35399nuc.LoaderManager.DDNONI) + ": ";
                    android.text.SpannableString spannableString2 = new android.text.SpannableString(str);
                    this.valueOf = spannableString2;
                    spannableString2.setSpan(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(copydefault(), C52761wXj.Activity.awiJhF)), 0, str.length(), 33);
                    android.text.SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append((java.lang.CharSequence) this.valueOf).append((java.lang.CharSequence) " ");
                    DraftMessageModel draftMessageModel2 = AEQbTJ().getDraftMessageModel();
                    spannableStringBuilderAppend.append((java.lang.CharSequence) (draftMessageModel2 != null ? draftMessageModel2.getMessage() : null));
                    ngg = this;
                    ngg.KWHzl(spannableStringBuilder);
                    return Unit.INSTANCE;
                }
                this.valueOf = new android.text.SpannableString("");
                groupConversation$buildConversationContent$1.L$0 = this;
                groupConversation$buildConversationContent$1.L$1 = spannableStringBuilder;
                groupConversation$buildConversationContent$1.label = 2;
                if (EZpvd(latestMessage, spannableStringBuilder, groupConversation$buildConversationContent$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
            ngg = this;
            spannableStringBuilder2 = spannableStringBuilder;
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            spannableStringBuilder2 = (android.text.SpannableStringBuilder) groupConversation$buildConversationContent$1.L$1;
            ngg = (nGG) groupConversation$buildConversationContent$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        spannableStringBuilder = spannableStringBuilder2;
        ngg.KWHzl(spannableStringBuilder);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0108 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(OKMessageContent oKMessageContent, @NotNull android.text.SpannableStringBuilder spannableStringBuilder, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        GroupConversation$updateSummary$1 groupConversation$updateSummary$1;
        InterfaceC35180nqU interfaceC35180nqU;
        OKMessage oKMessageAEQbTJ;
        OKMessage.MessageDirection messageDirection;
        java.lang.String userId;
        nGG ngg;
        java.lang.Object obj;
        OKMessage oKMessage;
        android.text.SpannableStringBuilder spannableStringBuilder2;
        java.lang.String str;
        sKH skhCopydefault;
        OKMessage oKMessage2;
        sKH skh;
        nGG ngg2;
        AbstractC35703oAo<? extends OKMessageContent, ? extends ViewDataBinding> abstractC35703oAoEZpvd;
        if (continuation instanceof GroupConversation$updateSummary$1) {
            groupConversation$updateSummary$1 = (GroupConversation$updateSummary$1) continuation;
            int i = groupConversation$updateSummary$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupConversation$updateSummary$1.label = i - Integer.MIN_VALUE;
            } else {
                groupConversation$updateSummary$1 = new GroupConversation$updateSummary$1(this, continuation);
            }
        }
        java.lang.Object obj2 = groupConversation$updateSummary$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = groupConversation$updateSummary$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj2);
            interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            if (interfaceC35180nqU != null && oKMessageContent != null) {
                oKMessageAEQbTJ = OKMessage.Companion.AEQbTJ(AEQbTJ().getTargetId(), OKConversationType.GROUP, oKMessageContent);
                if (Intrinsics.EZpvd((java.lang.Object) oKMessageAEQbTJ.getSenderUserId(), (java.lang.Object) C44157sFk.copydefault(C44157sFk.gEmmrt()))) {
                    messageDirection = OKMessage.MessageDirection.SEND;
                } else {
                    messageDirection = OKMessage.MessageDirection.RECEIVE;
                }
                oKMessageAEQbTJ.setMessageDirection(messageDirection);
                OKUserInfo userInfo = oKMessageContent.getUserInfo();
                if (userInfo == null || (userId = userInfo.getUserId()) == null) {
                    userId = "";
                }
                oKMessageAEQbTJ.setSenderUserId(userId);
                if (!(oKMessageAEQbTJ.getContent() instanceof OKRecallNotificationMessage) && !C44166sFt.OLrzqt(AEQbTJ())) {
                    sKH skhCopydefault2 = interfaceC35180nqU.copydefault();
                    groupConversation$updateSummary$1.L$0 = this;
                    groupConversation$updateSummary$1.L$1 = spannableStringBuilder;
                    groupConversation$updateSummary$1.L$2 = interfaceC35180nqU;
                    groupConversation$updateSummary$1.L$3 = oKMessageAEQbTJ;
                    groupConversation$updateSummary$1.label = 1;
                    java.lang.Object objOLrzqt = skhCopydefault2.OLrzqt(oKMessageAEQbTJ, (java.lang.String) null, groupConversation$updateSummary$1);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    ngg = this;
                    obj = objOLrzqt;
                    oKMessage = oKMessageAEQbTJ;
                } else {
                    ngg = this;
                    oKMessage = oKMessageAEQbTJ;
                    spannableStringBuilder2 = spannableStringBuilder;
                    str = null;
                    skhCopydefault = interfaceC35180nqU.copydefault();
                    groupConversation$updateSummary$1.L$0 = ngg;
                    groupConversation$updateSummary$1.L$1 = spannableStringBuilder2;
                    groupConversation$updateSummary$1.L$2 = oKMessage;
                    groupConversation$updateSummary$1.L$3 = str;
                    groupConversation$updateSummary$1.L$4 = oKMessage;
                    groupConversation$updateSummary$1.L$5 = skhCopydefault;
                    groupConversation$updateSummary$1.label = 2;
                    if (skhCopydefault.EZpvd(oKMessage, groupConversation$updateSummary$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    oKMessage2 = oKMessage;
                    skh = skhCopydefault;
                    ngg2 = ngg;
                    skh.OLrzqt(oKMessage2);
                    skh.copydefault(oKMessage2);
                    abstractC35703oAoEZpvd = C35696oAh.KWHzl.EZpvd(oKMessage2);
                    if (abstractC35703oAoEZpvd != null) {
                    }
                    if (abstractC35703oAoEZpvd != null) {
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            skh = (sKH) groupConversation$updateSummary$1.L$5;
            str = (java.lang.String) groupConversation$updateSummary$1.L$3;
            oKMessage2 = (OKMessage) groupConversation$updateSummary$1.L$2;
            spannableStringBuilder2 = (android.text.SpannableStringBuilder) groupConversation$updateSummary$1.L$1;
            ngg2 = (nGG) groupConversation$updateSummary$1.L$0;
            C56391yDq.AEQbTJ(obj2);
            skh.OLrzqt(oKMessage2);
            skh.copydefault(oKMessage2);
            abstractC35703oAoEZpvd = C35696oAh.KWHzl.EZpvd(oKMessage2);
            java.lang.CharSequence charSequenceAEQbTJ = abstractC35703oAoEZpvd != null ? abstractC35703oAoEZpvd.AEQbTJ(ngg2.copydefault(), oKMessage2) : null;
            if (abstractC35703oAoEZpvd != null) {
                if (abstractC35703oAoEZpvd.be_().size() == 2) {
                    spannableStringBuilder2.append(charSequenceAEQbTJ != null ? charSequenceAEQbTJ : "");
                } else if (C33129mqd.OLrzqt((java.lang.CharSequence) str) && C33129mqd.OLrzqt(charSequenceAEQbTJ)) {
                    spannableStringBuilder2.append((java.lang.CharSequence) str).append((java.lang.CharSequence) ngg2.OLrzqt()).append(" ").append(charSequenceAEQbTJ);
                } else if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                    spannableStringBuilder2.append((java.lang.CharSequence) str);
                } else if (C33129mqd.OLrzqt(charSequenceAEQbTJ)) {
                    spannableStringBuilder2.append(charSequenceAEQbTJ);
                }
            }
            return Unit.INSTANCE;
        }
        oKMessage = (OKMessage) groupConversation$updateSummary$1.L$3;
        InterfaceC35180nqU interfaceC35180nqU2 = (InterfaceC35180nqU) groupConversation$updateSummary$1.L$2;
        android.text.SpannableStringBuilder spannableStringBuilder3 = (android.text.SpannableStringBuilder) groupConversation$updateSummary$1.L$1;
        ngg = (nGG) groupConversation$updateSummary$1.L$0;
        C56391yDq.AEQbTJ(obj2);
        interfaceC35180nqU = interfaceC35180nqU2;
        spannableStringBuilder = spannableStringBuilder3;
        obj = obj2;
        C44461sQr c44461sQr = (C44461sQr) obj;
        if (c44461sQr != null) {
            java.lang.String strCopydefault = C37683oyU.copydefault(c44461sQr);
            spannableStringBuilder2 = spannableStringBuilder;
            str = strCopydefault;
            skhCopydefault = interfaceC35180nqU.copydefault();
            groupConversation$updateSummary$1.L$0 = ngg;
            groupConversation$updateSummary$1.L$1 = spannableStringBuilder2;
            groupConversation$updateSummary$1.L$2 = oKMessage;
            groupConversation$updateSummary$1.L$3 = str;
            groupConversation$updateSummary$1.L$4 = oKMessage;
            groupConversation$updateSummary$1.L$5 = skhCopydefault;
            groupConversation$updateSummary$1.label = 2;
            if (skhCopydefault.EZpvd(oKMessage, groupConversation$updateSummary$1) == objCopydefault) {
            }
        } else {
            oKMessageAEQbTJ = oKMessage;
            oKMessage = oKMessageAEQbTJ;
            spannableStringBuilder2 = spannableStringBuilder;
            str = null;
            skhCopydefault = interfaceC35180nqU.copydefault();
            groupConversation$updateSummary$1.L$0 = ngg;
            groupConversation$updateSummary$1.L$1 = spannableStringBuilder2;
            groupConversation$updateSummary$1.L$2 = oKMessage;
            groupConversation$updateSummary$1.L$3 = str;
            groupConversation$updateSummary$1.L$4 = oKMessage;
            groupConversation$updateSummary$1.L$5 = skhCopydefault;
            groupConversation$updateSummary$1.label = 2;
            if (skhCopydefault.EZpvd(oKMessage, groupConversation$updateSummary$1) == objCopydefault) {
            }
        }
    }

    public void copydefault(@NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        OLrzqt(oKConversation);
    }
}
