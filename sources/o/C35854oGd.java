package o;

import com.google.common.annotations.VisibleForTesting;
import com.okinc.im.config.page.IMPageType;
import com.okinc.im.imui.inputpanelV2.pluginV2.FilePlugin;
import com.okinc.im.usecase.pluginlist.ObservePluginListUseCase$execute$1;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oGd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35854oGd {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final oFZ AEQbTJ;
    public final oFX EZpvd;
    public final C35748oCf KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final C35852oGb gEmmrt;

    /* JADX INFO: renamed from: o.oGd$TaskDescription */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKConversationType.values().length];
            try {
                iArr[OKConversationType.PRIVATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKConversationType.GROUP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    @yCM
    public C35854oGd(@NotNull C35852oGb c35852oGb, @NotNull oFX ofx, @NotNull oFZ ofz, @NotNull C35748oCf c35748oCf, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c35852oGb, "");
        Intrinsics.checkNotNullParameter(ofx, "");
        Intrinsics.checkNotNullParameter(ofz, "");
        Intrinsics.checkNotNullParameter(c35748oCf, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.gEmmrt = c35852oGb;
        this.EZpvd = ofx;
        this.AEQbTJ = ofz;
        this.KWHzl = c35748oCf;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.oGd$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oGd.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final Flow<kotlin.Pair<C35287nsV, java.util.List<AbstractC35291nsZ>>> OLrzqt(java.lang.String str, IMPageType iMPageType) {
        Flow flowFlowOf;
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            flowFlowOf = FlowKt.flowOf((java.lang.Object) null);
        } else {
            flowFlowOf = FlowKt.combine(this.gEmmrt.OLrzqt(str), FlowKt.flowOf(this.EZpvd.EZpvd()), this.AEQbTJ.OLrzqt(), new ObservePluginListUseCase$execute$1(this, iMPageType, null));
        }
        return FlowKt.flowOn(flowFlowOf, this.OLrzqt);
    }

    public final java.util.List<AbstractC35291nsZ> KWHzl(java.util.List<? extends AbstractC35291nsZ> list, C35287nsV c35287nsV, IMPageType iMPageType) {
        java.lang.Boolean showVoiceCall;
        OKConversation oKConversationKWHzl = c35287nsV.KWHzl();
        boolean zBooleanValue = true;
        final boolean z = (oKConversationKWHzl != null ? oKConversationKWHzl.getConversationType() : null) == OKConversationType.PRIVATE;
        RelationInfo relationInfoEZpvd = c35287nsV.EZpvd();
        if (relationInfoEZpvd != null && (showVoiceCall = relationInfoEZpvd.getShowVoiceCall()) != null) {
            zBooleanValue = showVoiceCall.booleanValue();
        }
        final boolean z2 = zBooleanValue;
        GroupInfo groupInfoCopydefault = c35287nsV.copydefault();
        final boolean allowStartGroupVoiceCall = groupInfoCopydefault != null ? groupInfoCopydefault.getAllowStartGroupVoiceCall() : false;
        OKConversation oKConversationKWHzl2 = c35287nsV.KWHzl();
        OKConversationType conversationType = oKConversationKWHzl2 != null ? oKConversationKWHzl2.getConversationType() : null;
        GroupInfo groupInfoCopydefault2 = c35287nsV.copydefault();
        final boolean zAEQbTJ = AEQbTJ(conversationType, iMPageType, groupInfoCopydefault2 != null ? java.lang.Boolean.valueOf(groupInfoCopydefault2.getAllowPayGifts()) : null);
        OKConversation oKConversationKWHzl3 = c35287nsV.KWHzl();
        final boolean zCopydefault = copydefault(oKConversationKWHzl3 != null ? oKConversationKWHzl3.getConversationType() : null, iMPageType);
        OKConversation oKConversationKWHzl4 = c35287nsV.KWHzl();
        OKConversationType conversationType2 = oKConversationKWHzl4 != null ? oKConversationKWHzl4.getConversationType() : null;
        GroupTagType.Application application = GroupTagType.Companion;
        GroupInfo groupInfoCopydefault3 = c35287nsV.copydefault();
        final boolean zKWHzl = KWHzl(conversationType2, application.copydefault(groupInfoCopydefault3 != null ? groupInfoCopydefault3.getType() : null), KWHzl(c35287nsV));
        java.util.List<AbstractC35291nsZ> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list);
        final Function1 function1 = new Function1() { // from class: o.oGa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C35854oGd.AEQbTJ(z, z2, zAEQbTJ, zCopydefault, allowStartGroupVoiceCall, zKWHzl, (AbstractC35291nsZ) obj));
            }
        };
        listFJNWhG.removeIf(new java.util.function.Predicate() { // from class: o.oGc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return C35854oGd.OLrzqt(function1, obj);
            }
        });
        return listFJNWhG;
    }

    public static final boolean OLrzqt(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean AEQbTJ(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, AbstractC35291nsZ abstractC35291nsZ) {
        Intrinsics.checkNotNullParameter(abstractC35291nsZ, "");
        return ((abstractC35291nsZ instanceof C36492obw) && !(z && z2)) || ((abstractC35291nsZ instanceof C36489obt) && !z3) || (((abstractC35291nsZ instanceof C36488obs) && !z4) || (((abstractC35291nsZ instanceof C36494oby) && !z5) || ((abstractC35291nsZ instanceof FilePlugin) && !z6)));
    }

    @VisibleForTesting
    public final boolean AEQbTJ(OKConversationType oKConversationType, IMPageType iMPageType, java.lang.Boolean bool) {
        boolean z = false;
        boolean zEZpvd = this.KWHzl.KWHzl() ? Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) : false;
        if (iMPageType == IMPageType.NORMAL_IM && oKConversationType == OKConversationType.GROUP && zEZpvd) {
            z = true;
        }
        pUU.KWHzl("ObservePluginListUseCase", "isAllowRedPacketPlugin:" + z);
        return z;
    }

    @VisibleForTesting
    public final boolean copydefault(OKConversationType oKConversationType, IMPageType iMPageType) {
        boolean z = iMPageType == IMPageType.NORMAL_IM && oKConversationType == OKConversationType.PRIVATE && this.KWHzl.KWHzl();
        pUU.KWHzl("ObservePluginListUseCase", "isAllowTransferPlugin:" + z);
        return z;
    }

    public final java.lang.Boolean KWHzl(C35287nsV c35287nsV) {
        GroupInfo groupInfoCopydefault;
        OKConversation oKConversationKWHzl = c35287nsV.KWHzl();
        OKConversationType conversationType = oKConversationKWHzl != null ? oKConversationKWHzl.getConversationType() : null;
        int i = conversationType == null ? -1 : TaskDescription.OLrzqt[conversationType.ordinal()];
        if (i != 1) {
            if (i == 2 && (groupInfoCopydefault = c35287nsV.copydefault()) != null) {
                return java.lang.Boolean.valueOf(groupInfoCopydefault.getAllowFile());
            }
            return null;
        }
        RelationInfo relationInfoEZpvd = c35287nsV.EZpvd();
        if (relationInfoEZpvd != null) {
            return relationInfoEZpvd.getAllowFile();
        }
        return null;
    }

    public static /* synthetic */ boolean isAllowFilePlugin$default(C35854oGd c35854oGd, OKConversationType oKConversationType, GroupTagType groupTagType, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            bool = null;
        }
        return c35854oGd.KWHzl(oKConversationType, groupTagType, bool);
    }

    @VisibleForTesting
    public final boolean KWHzl(OKConversationType oKConversationType, GroupTagType groupTagType, java.lang.Boolean bool) {
        boolean zEZpvd = Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE);
        pUU.KWHzl("ObservePluginListUseCase", "isAllowFilePlugin: " + zEZpvd + " (allowFile=" + bool + ", conversationType=" + oKConversationType + ", groupType=" + groupTagType + ")");
        return zEZpvd;
    }
}
