package stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import javabeans.Carta;

public class Stack {

    private ArrayList<Carta> dados;

    public Stack() {

        this.dados = new ArrayList();

    }

    public void push(Carta obj) {

        this.dados.add(obj);

    }

    public Carta pop() throws EmptyStackException {

        int top = this.dados.size() - 1;

        return this.dados.get(top);

    }

    public boolean hasMoreElements() {

        if (this.dados.size() <= 0) {

            return false;

        } else {

            return true;

        }

    }

    public boolean isEmpty() {

        if (this.dados.isEmpty()) {

            return true;

        } else {

            return false;

        }

    }

}


