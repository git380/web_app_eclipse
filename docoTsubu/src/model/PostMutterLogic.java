package model;

//import java.util.List;
import dao.MutterDAO;

public class PostMutterLogic {
	/*public void execute(Mutter mutter, List<Mutter> mutterList) {
	mutterList.add(0, mutter); // 先頭に追加 解説①
	}*/

	public void execute(Mutter mutter) { // 引数を1つに変更
		MutterDAO dao = new MutterDAO();
		dao.create(mutter);
	}

	public void del(Mutter mutter) { // 引数を1つに変更
		MutterDAO dao = new MutterDAO();
		dao.delete(mutter);
	}
}