package o;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import me.drakeet.multitype.BinderNotFoundException;

/* JADX INFO: renamed from: o.zip, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59534zip extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final java.lang.String TAG = "MultiTypeAdapter";
    private java.util.List<?> items;
    private InterfaceC59540ziv typePool;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<?> getItems() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC59540ziv getTypePool() {
        return this.typePool;
    }

    public C59534zip() {
        this(Collections.emptyList());
    }

    public C59534zip(@androidx.annotation.NonNull java.util.List<?> list) {
        this(list, new C59532zin());
    }

    public C59534zip(@androidx.annotation.NonNull java.util.List<?> list, int i) {
        this(list, new C59532zin(i));
    }

    public C59534zip(@androidx.annotation.NonNull java.util.List<?> list, @androidx.annotation.NonNull InterfaceC59540ziv interfaceC59540ziv) {
        C59536zir.OLrzqt(list);
        C59536zir.OLrzqt(interfaceC59540ziv);
        this.items = list;
        this.typePool = interfaceC59540ziv;
    }

    public <T> void register(@androidx.annotation.NonNull java.lang.Class<? extends T> cls, @androidx.annotation.NonNull AbstractC59533zio<T, ?> abstractC59533zio) {
        C59536zir.OLrzqt(cls);
        C59536zir.OLrzqt(abstractC59533zio);
        checkAndRemoveAllTypesIfNeeded(cls);
        register(cls, abstractC59533zio, new C59535ziq());
    }

    public <T> void register(@androidx.annotation.NonNull java.lang.Class<? extends T> cls, @androidx.annotation.NonNull AbstractC59533zio<T, ?> abstractC59533zio, @androidx.annotation.NonNull InterfaceC59531zim<T> interfaceC59531zim) {
        this.typePool.KWHzl(cls, abstractC59533zio, interfaceC59531zim);
        abstractC59533zio.installAdapter(this);
    }

    public <T> InterfaceC59537zis<T> register(@androidx.annotation.NonNull java.lang.Class<? extends T> cls) {
        C59536zir.OLrzqt(cls);
        checkAndRemoveAllTypesIfNeeded(cls);
        return new C59539ziu(this, cls);
    }

    public void registerAll(@androidx.annotation.NonNull InterfaceC59540ziv interfaceC59540ziv) {
        C59536zir.OLrzqt(interfaceC59540ziv);
        int iEZpvd = interfaceC59540ziv.EZpvd();
        for (int i = 0; i < iEZpvd; i++) {
            registerWithoutChecking(interfaceC59540ziv.KWHzl(i), interfaceC59540ziv.copydefault(i), interfaceC59540ziv.EZpvd(i));
        }
    }

    public boolean unregister(@androidx.annotation.NonNull java.lang.Class<?> cls) {
        return this.typePool.AEQbTJ(cls);
    }

    public boolean unregisterAll() {
        return this.typePool.AEQbTJ();
    }

    public void setItems(@androidx.annotation.NonNull java.util.List<?> list) {
        C59536zir.OLrzqt(list);
        this.items = list;
    }

    public void setTypePool(@androidx.annotation.NonNull InterfaceC59540ziv interfaceC59540ziv) {
        C59536zir.OLrzqt(interfaceC59540ziv);
        this.typePool = interfaceC59540ziv;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return indexInTypesOf(i, this.items.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        return this.typePool.copydefault(i).onCreateViewHolder(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @java.lang.Deprecated
    public final void onBindViewHolder(@androidx.annotation.NonNull RecyclerView.ViewHolder viewHolder, int i) {
        onBindViewHolder(viewHolder, i, Collections.emptyList());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, @androidx.annotation.NonNull java.util.List<java.lang.Object> list) {
        this.typePool.copydefault(viewHolder.getItemViewType()).onBindViewHolder(viewHolder, this.items.get(i), list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return this.typePool.copydefault(getItemViewType(i)).getItemId(this.items.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(@androidx.annotation.NonNull RecyclerView.ViewHolder viewHolder) {
        getRawBinderByViewHolder(viewHolder).onViewRecycled(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(@androidx.annotation.NonNull RecyclerView.ViewHolder viewHolder) {
        return getRawBinderByViewHolder(viewHolder).onFailedToRecycleView(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(@androidx.annotation.NonNull RecyclerView.ViewHolder viewHolder) {
        getRawBinderByViewHolder(viewHolder).onViewAttachedToWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewDetachedFromWindow(@androidx.annotation.NonNull RecyclerView.ViewHolder viewHolder) {
        getRawBinderByViewHolder(viewHolder).onViewDetachedFromWindow(viewHolder);
    }

    public final AbstractC59533zio getRawBinderByViewHolder(@androidx.annotation.NonNull RecyclerView.ViewHolder viewHolder) {
        return this.typePool.copydefault(viewHolder.getItemViewType());
    }

    public int indexInTypesOf(int i, @androidx.annotation.NonNull java.lang.Object obj) throws BinderNotFoundException {
        int iKWHzl = this.typePool.KWHzl(obj.getClass());
        if (iKWHzl != -1) {
            return iKWHzl + this.typePool.EZpvd(iKWHzl).OLrzqt(i, obj);
        }
        throw new BinderNotFoundException(obj.getClass());
    }

    public final void checkAndRemoveAllTypesIfNeeded(@androidx.annotation.NonNull java.lang.Class<?> cls) {
        if (this.typePool.AEQbTJ(cls)) {
            cls.getSimpleName();
        }
    }

    public final void registerWithoutChecking(@androidx.annotation.NonNull java.lang.Class cls, @androidx.annotation.NonNull AbstractC59533zio abstractC59533zio, @androidx.annotation.NonNull InterfaceC59531zim interfaceC59531zim) {
        checkAndRemoveAllTypesIfNeeded(cls);
        register(cls, abstractC59533zio, interfaceC59531zim);
    }
}
