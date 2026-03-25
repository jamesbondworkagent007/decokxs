package o;

import android.graphics.drawable.ColorDrawable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.rewards.okplatform.LexicalDecorate;
import com.okinc.lexical.table.RichTextTable;
import com.okinc.lexical.table.RichTextTableCell;
import com.okinc.lexical.table.RichTextTableRow;
import kotlin.jvm.internal.Intrinsics;
import o.C28102kOz;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pIo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C38001pIo extends android.widget.FrameLayout {
    public final C59534zip AEQbTJ;
    public final java.util.ArrayList<java.lang.Object> KWHzl;
    public int OLrzqt;
    public RecyclerView copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38001pIo(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        this.KWHzl = arrayList;
        C59534zip c59534zip = new C59534zip(arrayList);
        this.AEQbTJ = c59534zip;
        RecyclerView recyclerView = (RecyclerView) android.view.LayoutInflater.from(getContext()).inflate(C28102kOz.Activity.copydefault, this).findViewById(C28102kOz.StateListAnimator.hDKMBd);
        this.copydefault = recyclerView;
        recyclerView.setFocusable(false);
        this.copydefault.setFocusableInTouchMode(false);
        this.copydefault.setAdapter(c59534zip);
        ColorDrawable colorDrawable = new ColorDrawable(ContextCompat.getColor(getContext(), C32113mPz.ActionBar.fJNWhG));
        this.copydefault.addItemDecoration(new C31707mAy(colorDrawable, 0, 2, colorDrawable, 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38001pIo(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        this.KWHzl = arrayList;
        C59534zip c59534zip = new C59534zip(arrayList);
        this.AEQbTJ = c59534zip;
        RecyclerView recyclerView = (RecyclerView) android.view.LayoutInflater.from(getContext()).inflate(C28102kOz.Activity.copydefault, this).findViewById(C28102kOz.StateListAnimator.hDKMBd);
        this.copydefault = recyclerView;
        recyclerView.setFocusable(false);
        this.copydefault.setFocusableInTouchMode(false);
        this.copydefault.setAdapter(c59534zip);
        ColorDrawable colorDrawable = new ColorDrawable(ContextCompat.getColor(getContext(), C32113mPz.ActionBar.fJNWhG));
        this.copydefault.addItemDecoration(new C31707mAy(colorDrawable, 0, 2, colorDrawable, 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38001pIo(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        this.KWHzl = arrayList;
        C59534zip c59534zip = new C59534zip(arrayList);
        this.AEQbTJ = c59534zip;
        RecyclerView recyclerView = (RecyclerView) android.view.LayoutInflater.from(getContext()).inflate(C28102kOz.Activity.copydefault, this).findViewById(C28102kOz.StateListAnimator.hDKMBd);
        this.copydefault = recyclerView;
        recyclerView.setFocusable(false);
        this.copydefault.setFocusableInTouchMode(false);
        this.copydefault.setAdapter(c59534zip);
        ColorDrawable colorDrawable = new ColorDrawable(ContextCompat.getColor(getContext(), C32113mPz.ActionBar.fJNWhG));
        this.copydefault.addItemDecoration(new C31707mAy(colorDrawable, 0, 2, colorDrawable, 0));
    }

    public static /* synthetic */ void setTableData$default(C38001pIo c38001pIo, RichTextTable richTextTable, LexicalDecorate lexicalDecorate, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            lexicalDecorate = null;
        }
        c38001pIo.setTableData(richTextTable, lexicalDecorate);
    }

    public final void setTableData(@NotNull RichTextTable richTextTable, LexicalDecorate lexicalDecorate) {
        Intrinsics.checkNotNullParameter(richTextTable, "");
        this.AEQbTJ.register(RichTextTableCell.class, new C38004pIr(lexicalDecorate));
        this.KWHzl.clear();
        for (RichTextTableRow richTextTableRow : richTextTable.getChildren()) {
            this.OLrzqt = richTextTableRow.getChildren().size();
            this.KWHzl.addAll(richTextTableRow.getChildren());
        }
        final android.content.Context context = getContext();
        final int i = this.OLrzqt;
        this.copydefault.setLayoutManager(new GridLayoutManager(context, i) { // from class: com.okinc.lexical.ui.LexicalTableView$setTableData$gridLayoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollHorizontally() {
                return false;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        this.AEQbTJ.notifyDataSetChanged();
    }
}
