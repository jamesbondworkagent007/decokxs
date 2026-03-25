package org.jdom2;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import o.InterfaceC59869zpF;
import o.InterfaceC59880zpQ;
import org.jdom2.filter.Filter;

/* JADX INFO: loaded from: classes24.dex */
public interface Parent extends Cloneable, InterfaceC59869zpF, Serializable {
    Parent addContent(int i, Collection<? extends Content> collection);

    Parent addContent(int i, Content content);

    Parent addContent(Collection<? extends Content> collection);

    Parent addContent(Content content);

    void canContainContent(Content content, int i, boolean z) throws IllegalAddException;

    Object clone();

    List<Content> cloneContent();

    List<Content> getContent();

    <E extends Content> List<E> getContent(Filter<E> filter);

    Content getContent(int i);

    int getContentSize();

    InterfaceC59880zpQ<Content> getDescendants();

    <E extends Content> InterfaceC59880zpQ<E> getDescendants(Filter<E> filter);

    Document getDocument();

    Parent getParent();

    int indexOf(Content content);

    List<Content> removeContent();

    <E extends Content> List<E> removeContent(Filter<E> filter);

    Content removeContent(int i);

    boolean removeContent(Content content);
}
