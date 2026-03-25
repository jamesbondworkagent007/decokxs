package o;

import android.view.View;
import androidx.collection.ArrayMapKt;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.market.features.overview.domain.MemeInfo;
import com.okinc.business.market.features.tag.domain.CompactTag;
import com.okinc.business.market.features.tag.domain.TagEventProperty;
import com.okinc.business.market.features.tag.domain.TagGroup;
import com.okinc.business.market.features.tag.domain.TagMeta;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import com.okinc.business.market.widget.tag.TagEventSource;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kNA {
    public static final void KWHzl(@NotNull kNE kne, @NotNull android.content.Context context, @NotNull java.util.List<TagWrapper> list, @NotNull TagEventSource tagEventSource, @NotNull Function0<Unit> function0) {
        C28072kNw c28072kNwFromTagWrapper$default;
        TagEventProperty tagEventPropertyKWHzl;
        Intrinsics.checkNotNullParameter(kne, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(tagEventSource, "");
        Intrinsics.checkNotNullParameter(function0, "");
        kne.setVisibility(8);
        TagWrapper tagWrapper = (TagWrapper) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (tagWrapper == null || (c28072kNwFromTagWrapper$default = C28074kNy.fromTagWrapper$default(tagWrapper, false, context, 2, null)) == null || (tagEventPropertyKWHzl = tagWrapper.copydefault().OLrzqt().KWHzl()) == null) {
            return;
        }
        kne.EZpvd(c28072kNwFromTagWrapper$default);
        kne.setOnClickListener(new ActionBar(kne, 1000L, tagEventPropertyKWHzl, context, tagEventSource, function0));
        kne.setVisibility(0);
    }

    public static final void AEQbTJ(@NotNull TagEventProperty tagEventProperty, @NotNull android.content.Context context, @NotNull TagEventSource tagEventSource) {
        Intrinsics.checkNotNullParameter(tagEventProperty, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(tagEventSource, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) tagEventProperty.copydefault())) {
            InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
            gKZ gkz = gKZ.EZpvd;
            InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, context, gkz.OLrzqt(gkz.AEQbTJ(tagEventProperty.copydefault()), C56390yDp.OLrzqt("from", tagEventSource.getValue())), null, new Function1() { // from class: o.kNx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kNA.EZpvd((AbstractC43238rlX) obj);
                }
            }, 4, null);
        } else if (C33129mqd.OLrzqt((java.lang.CharSequence) tagEventProperty.EZpvd())) {
            C25352ivB.KWHzl(context, tagEventProperty.EZpvd());
        }
    }

    public static final Unit EZpvd(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final java.util.List<TagWrapper> EZpvd(MemeInfo memeInfo, @NotNull java.util.List<TagWrapper> list) {
        java.lang.Object obj;
        java.lang.Object next;
        java.lang.Object next2;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((TagWrapper) next).OLrzqt(), (java.lang.Object) "communityRecognized")) {
                break;
            }
        }
        TagWrapper tagWrapper = (TagWrapper) next;
        if (tagWrapper != null) {
            arrayList.add(tagWrapper);
        }
        java.util.Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((TagWrapper) next2).OLrzqt(), (java.lang.Object) "duringEvent")) {
                break;
            }
        }
        TagWrapper tagWrapper2 = (TagWrapper) next2;
        if (tagWrapper2 != null) {
            arrayList.add(tagWrapper2);
        }
        TagWrapper tagWrapperKWHzl = KWHzl(memeInfo);
        if (tagWrapperKWHzl != null) {
            arrayList.add(tagWrapperKWHzl);
        }
        java.util.Iterator<T> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            java.lang.Object next3 = it3.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((TagWrapper) next3).OLrzqt(), (java.lang.Object) "lowLiquidity")) {
                obj = next3;
                break;
            }
        }
        TagWrapper tagWrapper3 = (TagWrapper) obj;
        if (tagWrapper3 != null) {
            arrayList.add(tagWrapper3);
        }
        return arrayList;
    }

    public static final TagWrapper KWHzl(MemeInfo memeInfo) {
        java.lang.String strAEQbTJ = memeInfo != null ? memeInfo.AEQbTJ() : null;
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        java.lang.String strEZpvd = memeInfo != null ? memeInfo.EZpvd() : null;
        if (strEZpvd == null || strEZpvd.length() <= 0) {
            return null;
        }
        return new TagWrapper(new CompactTag(strAEQbTJ, false, null, 6, null), new TagMeta(strAEQbTJ, strAEQbTJ, null, C33069mpW.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.fullyDrawnReported), ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt(MTPushConstants.PlatformNode.KEY_PLATFORM, strAEQbTJ))), strEZpvd, strEZpvd, strEZpvd, strEZpvd, null, null, 0, true, TagGroup.INFO, false, 9988, null));
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ Function0 AEQbTJ;
        public final /* synthetic */ long AhwBna;
        public final /* synthetic */ android.content.Context EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ TagEventSource OLrzqt;
        public final /* synthetic */ TagEventProperty copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, TagEventProperty tagEventProperty, android.content.Context context, TagEventSource tagEventSource, Function0 function0) {
            this.KWHzl = view;
            this.AhwBna = j;
            this.copydefault = tagEventProperty;
            this.EZpvd = context;
            this.OLrzqt = tagEventSource;
            this.AEQbTJ = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AhwBna || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                kNA.AEQbTJ(this.copydefault, this.EZpvd, this.OLrzqt);
                this.AEQbTJ.invoke();
            }
        }
    }
}
