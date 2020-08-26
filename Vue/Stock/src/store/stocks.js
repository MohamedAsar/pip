export const state = {
    stocks: [
        { name: "Samsung", price: 75 },
        { name: "Redmi", price: 52 },
        { name: "Apple", price: 53 },
        { name: "Vivo", price: 20 }
    ]
};

export const getters = {
    stocks: state => {
        console.log("stocks.getter"+state.stocks);
        return state.stocks;
    }
};
    
export const mutations = {
    endDay: state => {
        console.log("stock.mutation");
        state.stocks.forEach( (item) => {
            item.price = Math.round(item.price * (1 + Math.random() - 0.5));
        });
    }
};

export default {
    state,
    mutations,
    getters
}
