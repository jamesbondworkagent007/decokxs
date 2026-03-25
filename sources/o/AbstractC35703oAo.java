package o;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.menu.MenuActionBase;
import com.okinc.im.message.provider.AbsMessageViewProvider$launchAsync$job$1;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oAo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC35703oAo<C extends OKMessageContent, VDB extends ViewDataBinding> extends AbstractC35882oHe<C35254nrp, VDB> {
    public InterfaceC35283nsR AuCTel;
    public Function0<java.lang.Boolean> DbNXlk;
    public LifecycleOwner ejfBZ;
    public boolean fARcdN;
    public oAX fIwbmz;
    public Function0<Unit> getFieldNames;
    public Function1<? super OKMessage, Unit> getNewProxyInstance;
    public Function1<? super OKMessage, Unit> hDKMBd;
    public Function0<java.lang.Long> isConnected;
    public Function1<? super OKMessage, Unit> iwGUEr;
    public yHO<? super android.view.View, ? super java.util.List<? extends MenuActionBase>, ? super C35254nrp, Unit> uzCIH;
    public Function0<OKConversation> values;
    public Function0<com.okinc.okimcore.model.remote.UserInfo> zLjUOn;
    public final java.lang.String AkhnZx = "MessageViewProvider";
    public boolean fJNWhG = true;
    public java.util.HashMap<java.lang.Integer, Job> fetchVPNInfo = new java.util.HashMap<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function0<com.okinc.okimcore.model.remote.UserInfo> function0) {
        this.zLjUOn = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function1<? super OKMessage, Unit> function1) {
        this.iwGUEr = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(Function0<Unit> function0) {
        this.getFieldNames = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<java.lang.Long> AkhnZx() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.yHO<? super android.view.View, ? super java.util.List<? extends com.okinc.im.menu.MenuActionBase>, ? super o.nrp, kotlin.Unit>, o.yHO<android.view.View, java.util.List<? extends com.okinc.im.menu.MenuActionBase>, o.nrp, kotlin.Unit> */
    public final yHO<android.view.View, java.util.List<? extends MenuActionBase>, C35254nrp, Unit> AuCTel() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int EZpvd(@NotNull C c, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(c, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        this.ejfBZ = lifecycleOwner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function0<java.lang.Boolean> function0) {
        this.DbNXlk = function0;
    }

    public abstract java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull C c, @NotNull OKMessage oKMessage);

    public abstract java.lang.Class<C> KWHzl();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function0<java.lang.Long> function0) {
        this.isConnected = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull oAX oax) {
        Intrinsics.checkNotNullParameter(oax, "");
        this.fIwbmz = oax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.fJNWhG = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function1<? super OKMessage, Unit> function1) {
        this.getNewProxyInstance = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull InterfaceC35283nsR interfaceC35283nsR) {
        Intrinsics.checkNotNullParameter(interfaceC35283nsR, "");
        this.AuCTel = interfaceC35283nsR;
    }

    public abstract java.util.Set<OKMessage.MessageDirection> be_();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function1<? super OKMessage, Unit> function1) {
        this.hDKMBd = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(yHO<? super android.view.View, ? super java.util.List<? extends MenuActionBase>, ? super C35254nrp, Unit> yho) {
        this.uzCIH = yho;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.fARcdN = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.okimcore.model.im.OKMessage, kotlin.Unit>, kotlin.jvm.functions.Function1<com.okinc.okimcore.model.im.OKMessage, kotlin.Unit> */
    public final Function1<OKMessage, Unit> ejfBZ() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.okimcore.model.im.OKMessage, kotlin.Unit>, kotlin.jvm.functions.Function1<com.okinc.okimcore.model.im.OKMessage, kotlin.Unit> */
    public final Function1<OKMessage, Unit> fARcdN() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> fIwbmz() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.okimcore.model.im.OKMessage, kotlin.Unit>, kotlin.jvm.functions.Function1<com.okinc.okimcore.model.im.OKMessage, kotlin.Unit> */
    public final Function1<OKMessage, Unit> fJNWhG() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<OKConversation> fetchVPNInfo() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNewProxyInstance() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<com.okinc.okimcore.model.remote.UserInfo> hDKMBd() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final oAX isConnected() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean iwGUEr() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String uzCIH() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf(Function0<OKConversation> function0) {
        this.values = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC35283nsR values() {
        return this.AuCTel;
    }

    public final LifecycleOwner DbNXlk() {
        LifecycleOwner lifecycleOwner = this.ejfBZ;
        if (lifecycleOwner != null) {
            return lifecycleOwner;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final Job AEQbTJ(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(DbNXlk()), sDN.copydefault.copydefault(), null, new AbsMessageViewProvider$launchAsync$job$1(function2, null), 2, null);
        this.fetchVPNInfo.put(java.lang.Integer.valueOf(viewHolder.getBindingAdapterPosition()), jobLaunch$default);
        return jobLaunch$default;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.oGY<VDB extends androidx.databinding.ViewDataBinding> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC35882oHe
    public void AEQbTJ(@NotNull oGY<VDB> ogy) {
        Intrinsics.checkNotNullParameter(ogy, "");
        super.AEQbTJ(ogy);
        Job job = this.fetchVPNInfo.get(java.lang.Integer.valueOf(ogy.getBindingAdapterPosition()));
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
    }

    public final java.lang.CharSequence AEQbTJ(@NotNull android.content.Context context, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        try {
            OKMessageContent content = oKMessage.getContent();
            Intrinsics.copydefault(content, "");
            return KWHzl(context, content, oKMessage);
        } catch (java.lang.Exception e) {
            C44124sEe.imLogViewProvider$default("getSummaryText error", e, null, 4, null);
            return "";
        }
    }

    public final void copydefault(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        EZpvd(lifecycleOwner);
    }

    public final boolean getFieldNames() {
        Function0<java.lang.Boolean> function0 = this.DbNXlk;
        if (function0 == null || function0 == null) {
            return true;
        }
        return function0.invoke().booleanValue();
    }
}
