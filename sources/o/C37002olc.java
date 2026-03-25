package o;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.DiffUtil;
import com.okinc.im.menu.MenuActionBase;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKStreamPlaceHolderMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.olc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37002olc {
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.old
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C37002olc.AEQbTJ();
        }
    });

    public final java.util.List<AbstractC35703oAo<? extends OKMessageContent, ? extends ViewDataBinding>> EZpvd() {
        return (java.util.List) this.copydefault.getValue();
    }

    public static final java.util.List AEQbTJ() {
        return C35696oAh.KWHzl.AEQbTJ();
    }

    public final C37005olf OLrzqt(InterfaceC35283nsR interfaceC35283nsR, boolean z, Function0<java.lang.Boolean> function0, boolean z2, Function0<OKConversation> function02, Function0<com.okinc.okimcore.model.remote.UserInfo> function03, yHO<? super android.view.View, ? super java.util.List<? extends MenuActionBase>, ? super C35254nrp, Unit> yho, Function1<? super OKMessage, Unit> function1, Function1<? super OKMessage, Unit> function12, Function1<? super OKMessage, Unit> function13, Function0<Unit> function04, @NotNull LifecycleOwner lifecycleOwner, boolean z3, Function0<java.lang.Long> function05) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        java.util.Iterator<T> it = EZpvd().iterator();
        while (it.hasNext()) {
            AbstractC35703oAo abstractC35703oAo = (AbstractC35703oAo) it.next();
            abstractC35703oAo.KWHzl(z);
            abstractC35703oAo.copydefault(lifecycleOwner);
            abstractC35703oAo.KWHzl(C35697oAi.KWHzl);
            if (interfaceC35283nsR != null) {
                abstractC35703oAo.OLrzqt(interfaceC35283nsR);
            }
            abstractC35703oAo.EZpvd(function0);
            abstractC35703oAo.copydefault(z2);
            abstractC35703oAo.valueOf(function02);
            abstractC35703oAo.AEQbTJ(function03);
            abstractC35703oAo.copydefault(yho);
            abstractC35703oAo.copydefault(function1);
            abstractC35703oAo.OLrzqt(function12);
            abstractC35703oAo.AhwBna(function04);
            abstractC35703oAo.AEQbTJ(function13);
            abstractC35703oAo.KWHzl(function05);
            if (abstractC35703oAo instanceof AbstractC35707oAs) {
                ((AbstractC35707oAs) abstractC35703oAo).AEQbTJ(z3);
            }
        }
        return new C37005olf((AbstractC35703oAo[]) EZpvd().toArray(new AbstractC35703oAo[0]), new Activity());
    }

    /* JADX INFO: renamed from: o.olc$Activity */
    public static final class Activity extends DiffUtil.ItemCallback<C35254nrp> {
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(C35254nrp c35254nrp, C35254nrp c35254nrp2) {
            Intrinsics.checkNotNullParameter(c35254nrp, "");
            Intrinsics.checkNotNullParameter(c35254nrp2, "");
            java.lang.String clientMessageId = c35254nrp.OLrzqt().getClientMessageId();
            java.lang.String clientMessageId2 = c35254nrp2.OLrzqt().getClientMessageId();
            if (clientMessageId == null || clientMessageId2 == null) {
                return c35254nrp.OLrzqt().getSeq() == c35254nrp2.OLrzqt().getSeq();
            }
            return Intrinsics.EZpvd((java.lang.Object) clientMessageId, (java.lang.Object) clientMessageId2);
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(C35254nrp c35254nrp, C35254nrp c35254nrp2) {
            Intrinsics.checkNotNullParameter(c35254nrp, "");
            Intrinsics.checkNotNullParameter(c35254nrp2, "");
            return Intrinsics.EZpvd(c35254nrp, c35254nrp2);
        }

        /* JADX DEBUG: Method merged with bridge method: getChangePayload(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public java.lang.Object getChangePayload(C35254nrp c35254nrp, C35254nrp c35254nrp2) {
            Intrinsics.checkNotNullParameter(c35254nrp, "");
            Intrinsics.checkNotNullParameter(c35254nrp2, "");
            if (c35254nrp.OLrzqt().getSeq() != c35254nrp2.OLrzqt().getSeq()) {
                return null;
            }
            if (C37002olc.this.KWHzl(c35254nrp, c35254nrp2)) {
                pUU.EZpvd("MessageListAdapterDiff", "Streaming Replacement");
                return "PAYLOAD_STREAM_UPDATE";
            }
            if (Intrinsics.EZpvd(c35254nrp.OLrzqt().getReactionDisplay(), c35254nrp2.OLrzqt().getReactionDisplay())) {
                return null;
            }
            return "PAYLOAD_REACTION_UPDATE";
        }
    }

    public final boolean KWHzl(C35254nrp c35254nrp, C35254nrp c35254nrp2) {
        OKMessageContent content = c35254nrp.OLrzqt().getContent();
        if ((content instanceof OKStreamPlaceHolderMessage ? (OKStreamPlaceHolderMessage) content : null) == null) {
            return false;
        }
        OKMessageContent content2 = c35254nrp2.OLrzqt().getContent();
        if ((content2 instanceof OKStreamPlaceHolderMessage ? (OKStreamPlaceHolderMessage) content2 : null) == null) {
            return false;
        }
        return !Intrinsics.EZpvd((java.lang.Object) r4.getContent(), (java.lang.Object) r1.getContent());
    }
}
