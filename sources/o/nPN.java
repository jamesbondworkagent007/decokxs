package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.im.imui.conversation.message.viewmodel.tracker.IMEventTracker;
import com.okinc.im.imui.group.announcement.model.GroupAnnouncementData;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class nPN extends nPY {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public GroupAnnouncementData AEQbTJ;
    public final boolean OLrzqt = true;
    public C33885nJl copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.OLrzqt;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nPN.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final nPN KWHzl(@NotNull GroupAnnouncementData groupAnnouncementData) {
            Intrinsics.checkNotNullParameter(groupAnnouncementData, "");
            nPN npn = new nPN();
            npn.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("info", groupAnnouncementData)));
            return npn;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        GroupAnnouncementData groupAnnouncementData;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (groupAnnouncementData = (GroupAnnouncementData) arguments.getParcelable("info")) == null) {
            throw new java.lang.IllegalArgumentException("GroupAnnouncementData is required");
        }
        this.AEQbTJ = groupAnnouncementData;
    }

    @Override // o.wXX
    public void onSetBehavior(@NotNull BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        bottomSheetBehavior.setPeekHeight((int) (getResources().getDisplayMetrics().heightPixels * 0.5f));
        bottomSheetBehavior.setHideable(true);
        bottomSheetBehavior.setFitToContents(false);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        bottomSheetBehavior.setExpandedOffset(C55298xhM.copydefault(100.0f, contextRequireContext));
        bottomSheetBehavior.setState(4);
        bottomSheetBehavior.setDraggable(true);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        java.lang.String string = getString(C35399nuc.LoaderManager.geAOna);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wxq.setTitle(string);
        wxq.setStyle(4);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setCloseVisibility(false);
        wxq.setDividerVisibility(false);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.copydefault = C33885nJl.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
        AEQbTJ();
    }

    public final void AEQbTJ() {
        C33885nJl c33885nJl = this.copydefault;
        if (c33885nJl != null) {
            KWHzl();
            android.widget.TextView textView = c33885nJl.EZpvd;
            GroupAnnouncementData groupAnnouncementData = this.AEQbTJ;
            if (groupAnnouncementData == null) {
                Intrinsics.gEmmrt("");
                groupAnnouncementData = null;
            }
            textView.setText(groupAnnouncementData.getContent());
            C34086nQx c34086nQx = C34086nQx.AEQbTJ;
            android.widget.TextView textView2 = c33885nJl.EZpvd;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            C34086nQx.setupAnnouncementText$default(c34086nQx, textView2, 0, java.lang.Integer.valueOf(c33885nJl.EZpvd.getMaxLines()), false, new Function1() { // from class: o.nPP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return nPN.EZpvd(this.AEQbTJ, (java.lang.String) obj);
                }
            }, 5, null);
        }
    }

    public static final Unit EZpvd(nPN npn, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        npn.copydefault(str);
        return Unit.INSTANCE;
    }

    public final void copydefault(java.lang.String str) {
        IMEventTracker iMEventTracker = new IMEventTracker();
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        GroupAnnouncementData groupAnnouncementData = this.AEQbTJ;
        if (groupAnnouncementData == null) {
            Intrinsics.gEmmrt("");
            groupAnnouncementData = null;
        }
        java.lang.String groupId = groupAnnouncementData.getGroupId();
        IMEventTracker.LinkLocation linkLocation = IMEventTracker.LinkLocation.Announcement;
        GroupAnnouncementData groupAnnouncementData2 = this.AEQbTJ;
        if (groupAnnouncementData2 == null) {
            Intrinsics.gEmmrt("");
            groupAnnouncementData2 = null;
        }
        GroupMemberInfo announceAuthorInfo = groupAnnouncementData2.getAnnounceAuthorInfo();
        iMEventTracker.OLrzqt(lifecycleScope, groupId, str, linkLocation, announceAuthorInfo != null ? announceAuthorInfo.getMemberId() : null);
    }

    public final void KWHzl() {
        java.lang.String createByName;
        C33885nJl c33885nJl = this.copydefault;
        if (c33885nJl != null) {
            GroupAnnouncementData groupAnnouncementData = this.AEQbTJ;
            GroupAnnouncementData groupAnnouncementData2 = null;
            if (groupAnnouncementData == null) {
                Intrinsics.gEmmrt("");
                groupAnnouncementData = null;
            }
            GroupMemberInfo announceAuthorInfo = groupAnnouncementData.getAnnounceAuthorInfo();
            C35893oHp c35893oHp = c33885nJl.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
            C35891oHn.KWHzl(c35893oHp, announceAuthorInfo);
            android.widget.TextView textView = c33885nJl.gEmmrt;
            if (announceAuthorInfo == null || (createByName = C44157sFk.EZpvd(announceAuthorInfo)) == null) {
                GroupAnnouncementData groupAnnouncementData3 = this.AEQbTJ;
                if (groupAnnouncementData3 == null) {
                    Intrinsics.gEmmrt("");
                    groupAnnouncementData3 = null;
                }
                createByName = groupAnnouncementData3.getCreateByName();
            }
            textView.setText(createByName);
            GroupAnnouncementData groupAnnouncementData4 = this.AEQbTJ;
            if (groupAnnouncementData4 == null) {
                Intrinsics.gEmmrt("");
                groupAnnouncementData4 = null;
            }
            c33885nJl.AhwBna.setText(pTD.copydefault(this, C35399nuc.LoaderManager.DpxfQh, C56423yEv.EZpvd(C56390yDp.OLrzqt("date", pTA.format$default(new Date(groupAnnouncementData4.getCreateTime()), OKDateEnum.DATE_FORMAT_STANDARD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null)))));
            android.widget.TextView textView2 = c33885nJl.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            GroupAnnouncementData groupAnnouncementData5 = this.AEQbTJ;
            if (groupAnnouncementData5 == null) {
                Intrinsics.gEmmrt("");
                groupAnnouncementData5 = null;
            }
            textView2.setVisibility(groupAnnouncementData5.isEdit() ? 0 : 8);
            GroupAnnouncementData groupAnnouncementData6 = this.AEQbTJ;
            if (groupAnnouncementData6 == null) {
                Intrinsics.gEmmrt("");
                groupAnnouncementData6 = null;
            }
            if (groupAnnouncementData6.isEditedByCurrentUser()) {
                android.widget.TextView textView3 = c33885nJl.valueOf;
                textView3.setText(textView3.getContext().getString(C35399nuc.LoaderManager.HJWChPzRXNTw));
                return;
            }
            android.widget.TextView textView4 = c33885nJl.valueOf;
            android.content.Context context = textView4.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int i = C35399nuc.LoaderManager.OqCbbx;
            GroupAnnouncementData groupAnnouncementData7 = this.AEQbTJ;
            if (groupAnnouncementData7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                groupAnnouncementData2 = groupAnnouncementData7;
            }
            textView4.setText(pTD.KWHzl(context, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("user", groupAnnouncementData2.getEditedByName()))));
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.copydefault = null;
    }
}
