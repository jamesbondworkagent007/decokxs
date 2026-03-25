package o;

import android.view.ViewGroup;
import com.okinc.core.util.SPUtils;
import com.okinc.im.message.MessageClusterType;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.okimcore.model.im.OKMessageContent;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oAl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C35700oAl {
    public static final C35700oAl EZpvd = new C35700oAl();

    private C35700oAl() {
    }

    public final boolean AEQbTJ() {
        return SPUtils.getBoolean("ModifyIMAPIKeyActivity_KEY_MESSAGE_METADATA_TOGGLE", false);
    }

    public final boolean copydefault() {
        return SPUtils.getBoolean("ModifyIMAPIKeyActivity_KEY_MESSAGE_METADATA_DETAILED_TOGGLE", false);
    }

    public final java.lang.String copydefault(C35254nrp c35254nrp) {
        if (!AEQbTJ()) {
            return null;
        }
        boolean zCopydefault = copydefault();
        long seq = c35254nrp.OLrzqt().getSeq();
        java.lang.String targetId = c35254nrp.OLrzqt().getTargetId();
        MessageClusterType messageClusterTypeCopydefault = c35254nrp.copydefault();
        java.lang.String str = pTA.format$default(new Date(c35254nrp.OLrzqt().getSentTime()), OKDateEnum.DATE_FORMAT_STANDARD, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null);
        OKMessageContent content = c35254nrp.OLrzqt().getContent();
        java.lang.String simpleName = content != null ? content.getClass().getSimpleName() : null;
        boolean zValues = c35254nrp.values();
        java.lang.Boolean boolAkhnZx = c35254nrp.AkhnZx();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(targetId);
        sb.append('\n');
        if (!zCopydefault) {
            sb.append(seq);
        } else {
            sb.append(seq);
            Intrinsics.checkNotNullExpressionValue(sb, "");
            sb.append('\n');
        }
        if (zCopydefault) {
            sb.append(messageClusterTypeCopydefault);
            sb.append('\n');
            sb.append(str);
            sb.append('\n');
            sb.append("isShowIntervalTime=" + zValues);
            sb.append('\n');
            sb.append("isShowReceiverAvatar=" + boolAkhnZx);
            sb.append('\n');
            sb.append(simpleName);
        }
        return sb.toString();
    }

    public final void OLrzqt(@NotNull C35254nrp c35254nrp, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.View viewFindViewWithTag = viewGroup.findViewWithTag("DebugMessageAttachHelper");
        if (viewFindViewWithTag != null) {
            viewGroup.removeView(viewFindViewWithTag);
        }
        java.lang.String strCopydefault = copydefault(c35254nrp);
        if (strCopydefault == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault)) {
            return;
        }
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(linearLayout.getContext());
        linearLayout2.setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        linearLayout.addView(linearLayout2, -1, C55298xhM.dp2px$default(2.0f, null, 1, null));
        android.widget.TextView textView = new android.widget.TextView(viewGroup.getContext());
        textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        textView.setTextSize(2, 12.0f);
        textView.setGravity(17);
        textView.setText(strCopydefault);
        linearLayout.addView(textView, -1, -2);
        linearLayout.setTag("DebugMessageAttachHelper");
        viewGroup.addView(linearLayout, 0, new ViewGroup.LayoutParams(-1, -2));
    }
}
