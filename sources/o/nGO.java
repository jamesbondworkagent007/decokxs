package o;

import androidx.core.content.ContextCompat;
import androidx.databinding.ViewDataBinding;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKUserInfo;
import com.okinc.okimcore.model.room.inhouseim.DraftMessageModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public class nGO extends nGE {
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.nGE
    public java.lang.Object EZpvd(@NotNull Continuation<? super Unit> continuation) {
        return AEQbTJ(this, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nGO(@NotNull android.content.Context context, @NotNull OKConversation oKConversation) {
        super(context, oKConversation);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKConversation, "");
        this.gEmmrt = nGO.class.getSimpleName();
        EZpvd(oKConversation);
    }

    public static /* synthetic */ java.lang.Object AEQbTJ(nGO ngo, Continuation<? super Unit> continuation) {
        OKMessage.MessageDirection messageDirection;
        sKH skhCopydefault;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        DraftMessageModel draftMessageModel = ngo.AEQbTJ().getDraftMessageModel();
        if (!android.text.TextUtils.isEmpty(draftMessageModel != null ? draftMessageModel.getMessage() : null)) {
            java.lang.String str = ngo.copydefault().getString(C35399nuc.LoaderManager.DDNONI) + ": ";
            android.text.SpannableString spannableString = new android.text.SpannableString(str);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(ContextCompat.getColor(ngo.copydefault(), C52761wXj.Activity.awiJhF)), 0, str.length(), 33);
            android.text.SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append((java.lang.CharSequence) spannableString).append((java.lang.CharSequence) " ");
            DraftMessageModel draftMessageModel2 = ngo.AEQbTJ().getDraftMessageModel();
            spannableStringBuilderAppend.append(draftMessageModel2 != null ? draftMessageModel2.getMessage() : null);
        } else {
            OKMessageContent latestMessage = ngo.AEQbTJ().getLatestMessage();
            if (latestMessage != null) {
                OKMessage oKMessageAEQbTJ = OKMessage.Companion.AEQbTJ(ngo.AEQbTJ().getTargetId(), OKConversationType.PRIVATE, latestMessage);
                OKUserInfo userInfo = latestMessage.getUserInfo();
                oKMessageAEQbTJ.setSenderUserId(userInfo != null ? userInfo.getUserId() : null);
                if (Intrinsics.EZpvd((java.lang.Object) oKMessageAEQbTJ.getSenderUserId(), (java.lang.Object) C44157sFk.copydefault(C44157sFk.gEmmrt()))) {
                    messageDirection = OKMessage.MessageDirection.SEND;
                } else {
                    messageDirection = OKMessage.MessageDirection.RECEIVE;
                }
                oKMessageAEQbTJ.setMessageDirection(messageDirection);
                if (oKMessageAEQbTJ.getContent() != null) {
                    InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
                    if (interfaceC35180nqU != null && (skhCopydefault = interfaceC35180nqU.copydefault()) != null) {
                        skhCopydefault.copydefault(oKMessageAEQbTJ);
                        skhCopydefault.OLrzqt(oKMessageAEQbTJ);
                    }
                    AbstractC35703oAo<? extends OKMessageContent, ? extends ViewDataBinding> abstractC35703oAoEZpvd = C35696oAh.KWHzl.EZpvd(oKMessageAEQbTJ);
                    java.lang.CharSequence charSequenceAEQbTJ = abstractC35703oAoEZpvd != null ? abstractC35703oAoEZpvd.AEQbTJ(ngo.copydefault(), oKMessageAEQbTJ) : null;
                    if (charSequenceAEQbTJ != null && charSequenceAEQbTJ.length() > 0) {
                        spannableStringBuilder.append(charSequenceAEQbTJ);
                    }
                }
            }
        }
        ngo.KWHzl(spannableStringBuilder);
        return Unit.INSTANCE;
    }

    public void EZpvd(@NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        OLrzqt(oKConversation);
    }
}
