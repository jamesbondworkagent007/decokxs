package org.jdom2.output.support;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jdom2.CDATA;
import org.jdom2.Content;

/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractFormattedWalker {
    public static final CDATA OLrzqt = new CDATA("");
    public static final Iterator<Content> AEQbTJ = new Iterator<Content>() { // from class: org.jdom2.output.support.AbstractFormattedWalker.3
        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public Content next() {
            throw new NoSuchElementException("Cannot call next() on an empty iterator.");
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Cannot remove from an empty iterator.");
        }
    };

    public enum Trim {
        LEFT,
        RIGHT,
        BOTH,
        COMPACT,
        NONE
    }
}
