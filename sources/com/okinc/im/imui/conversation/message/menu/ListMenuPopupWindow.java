package com.okinc.im.imui.conversation.message.menu;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.conversation.message.menu.ListMenuPopupWindow;
import com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33946nLs;
import o.C33570myu;
import o.C35342ntX;
import o.C35399nuc;
import o.C35950oJs;
import o.C43312rms;
import o.C43318rmy;
import o.C55296xhK;
import o.C55298xhM;
import o.C56444yFp;
import o.C59534zip;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes18.dex */
public final class ListMenuPopupWindow extends PopupWindow {
    public RecyclerView AhwBna;
    public final C59534zip EZpvd;
    public Context KWHzl;
    public final ArrayList<IMenuItemPerformer> OLrzqt;
    public PopupWindow copydefault;
    public final WidthType valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListMenuPopupWindow(@NotNull Context context, @NotNull WidthType widthType) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(widthType, "");
        this.valueOf = widthType;
        ArrayList<IMenuItemPerformer> arrayList = new ArrayList<>();
        this.OLrzqt = arrayList;
        this.EZpvd = new C59534zip(arrayList);
        AEQbTJ(context);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:com.okinc.im.imui.conversation.message.menu.ListMenuPopupWindow$WidthType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.im.imui.conversation.message.menu.ListMenuPopupWindow$WidthType:0x0004: SGET  A[WRAPPED] (LINE:25) com.okinc.im.imui.conversation.message.menu.ListMenuPopupWindow.WidthType.ContextMenu com.okinc.im.imui.conversation.message.menu.ListMenuPopupWindow$WidthType) : (r2v0 com.okinc.im.imui.conversation.message.menu.ListMenuPopupWindow$WidthType))
 A[MD:(android.content.Context, com.okinc.im.imui.conversation.message.menu.ListMenuPopupWindow$WidthType):void (m)] (LINE:25) call: com.okinc.im.imui.conversation.message.menu.ListMenuPopupWindow.<init>(android.content.Context, com.okinc.im.imui.conversation.message.menu.ListMenuPopupWindow$WidthType):void type: THIS */
    public /* synthetic */ ListMenuPopupWindow(Context context, WidthType widthType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? WidthType.ContextMenu : widthType);
    }

    public final void AEQbTJ(Context context) {
        this.KWHzl = context;
        setContentView(LayoutInflater.from(context).inflate(C35399nuc.Dialog.invokespecialDPHOMC, (ViewGroup) null));
        PopupWindow popupWindow = new PopupWindow(getContentView(), -2, -2, true);
        this.copydefault = popupWindow;
        Intrinsics.copydefault(popupWindow);
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        View contentView = getContentView();
        Intrinsics.copydefault(contentView);
        RecyclerView recyclerView = (RecyclerView) contentView.findViewById(C35399nuc.StateListAnimator.iLWfRf);
        this.AhwBna = recyclerView;
        Intrinsics.copydefault(recyclerView);
        KWHzl(recyclerView, this.valueOf);
        RecyclerView recyclerView2 = this.AhwBna;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(context, 1, false));
        }
        this.EZpvd.register(IMenuItemPerformer.class, new ActionBar(context, this, C35399nuc.Dialog.TarCU, C35342ntX.djBIcL));
        RecyclerView recyclerView3 = this.AhwBna;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(this.EZpvd);
        }
    }

    public static final class ActionBar extends C43318rmy<IMenuItemPerformer, AbstractC33946nLs> {
        public final /* synthetic */ ListMenuPopupWindow AEQbTJ;
        public final /* synthetic */ Context OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(Context context, ListMenuPopupWindow listMenuPopupWindow, int i, int i2) {
            super(i, i2);
            this.OLrzqt = context;
            this.AEQbTJ = listMenuPopupWindow;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC33946nLs> c43312rms, final IMenuItemPerformer iMenuItemPerformer) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(iMenuItemPerformer, "");
            super.onBindViewHolder((C43312rms) c43312rms, iMenuItemPerformer);
            AbstractC33946nLs abstractC33946nLs = (AbstractC33946nLs) c43312rms.OLrzqt();
            abstractC33946nLs.OLrzqt.setText(iMenuItemPerformer.EZpvd());
            abstractC33946nLs.OLrzqt.setCompoundDrawablesRelativeWithIntrinsicBounds(iMenuItemPerformer.copydefault(), (Drawable) null, (Drawable) null, (Drawable) null);
            View view = c43312rms.itemView;
            final Context context = this.OLrzqt;
            final ListMenuPopupWindow listMenuPopupWindow = this.AEQbTJ;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.nAH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    ListMenuPopupWindow.ActionBar.copydefault(iMenuItemPerformer, context, listMenuPopupWindow, view2);
                }
            });
        }

        public static final void copydefault(IMenuItemPerformer iMenuItemPerformer, Context context, ListMenuPopupWindow listMenuPopupWindow, View view) {
            iMenuItemPerformer.AEQbTJ(context);
            listMenuPopupWindow.KWHzl();
        }
    }

    public final void KWHzl(View view, WidthType widthType) {
        view.setMinimumWidth(C55298xhM.dpInt$default(widthType.getWidthDp(), (Context) null, 1, (Object) null));
    }

    public final PopupWindow copydefault(@NotNull View view, @NotNull List<? extends IMenuItemPerformer> list, float f, float f2) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt.clear();
        this.OLrzqt.addAll(list);
        this.EZpvd.notifyDataSetChanged();
        C35950oJs c35950oJs = C35950oJs.OLrzqt;
        View contentView = getContentView();
        Intrinsics.checkNotNullExpressionValue(contentView, "");
        int[] iArrOLrzqt = c35950oJs.OLrzqt(view, contentView, f, f2, list.size(), OLrzqt());
        PopupWindow popupWindow = this.copydefault;
        Intrinsics.copydefault(popupWindow);
        popupWindow.showAtLocation(view, 8388659, iArrOLrzqt[0], iArrOLrzqt[1]);
        PopupWindow popupWindow2 = this.copydefault;
        Intrinsics.copydefault(popupWindow2);
        return popupWindow2;
    }

    public final PopupWindow OLrzqt(@NotNull View view, @NotNull List<? extends IMenuItemPerformer> list, float f) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt.clear();
        this.OLrzqt.addAll(list);
        this.EZpvd.notifyDataSetChanged();
        View contentView = getContentView();
        if (contentView != null) {
            contentView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        View contentView2 = getContentView();
        int measuredWidth = contentView2 != null ? contentView2.getMeasuredWidth() : 0;
        View contentView3 = getContentView();
        int measuredHeight = contentView3 != null ? contentView3.getMeasuredHeight() : 0;
        int iDpInt$default = C55298xhM.dpInt$default(f, (Context) null, 1, (Object) null);
        int iAEQbTJ = C33570myu.AEQbTJ();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[1];
        int height = view.getRootView().getHeight() - (view.getHeight() + i);
        if (height < C55298xhM.dpInt$default(80.0f, (Context) null, 1, (Object) null) + measuredHeight && i > height) {
            i -= measuredHeight;
        }
        PopupWindow popupWindow = this.copydefault;
        Intrinsics.copydefault(popupWindow);
        popupWindow.showAtLocation(view.getRootView(), 0, (iAEQbTJ - measuredWidth) - iDpInt$default, i + CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA);
        PopupWindow popupWindow2 = this.copydefault;
        Intrinsics.copydefault(popupWindow2);
        return popupWindow2;
    }

    public final void KWHzl() {
        PopupWindow popupWindow = this.copydefault;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        popupWindow.dismiss();
    }

    public final boolean OLrzqt() {
        Context context = this.KWHzl;
        if (context != null) {
            return C55296xhK.OLrzqt(context);
        }
        return false;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.conversation.message.menu.ListMenuPopupWindow.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class WidthType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ WidthType[] $VALUES;
        public static final WidthType ContextMenu = new WidthType("ContextMenu", 0, 120);
        public static final WidthType PopupMenu = new WidthType("PopupMenu", 1, 180);
        private final int widthDp;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ WidthType[] $values() {
            return new WidthType[]{ContextMenu, PopupMenu};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<WidthType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getWidthDp() {
            return this.widthDp;
        }

        private WidthType(String str, int i, int i2) {
            this.widthDp = i2;
        }

        static {
            WidthType[] widthTypeArr$values = $values();
            $VALUES = widthTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(widthTypeArr$values);
        }

        public static WidthType valueOf(String str) {
            return (WidthType) Enum.valueOf(WidthType.class, str);
        }

        public static WidthType[] values() {
            return (WidthType[]) $VALUES.clone();
        }
    }
}
